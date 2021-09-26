// Copyright (c) 2021, Chirag Patel
package main

import (
	"fmt"
	"strings"
)

// આ વપરાશકર્તાને સહાયક થાય એ માટેનું ફંક્શન છે
func sahaay() {
	fmt.Println("નમસ્તે! કેલ્ક્યુલેટર કાર્યક્રમમાં આપનું સ્વાગત છે!")
	fmt.Println("કોઈ એક પ્રક્રિયાનું ચયન કરો (+ - x / % ?) : ")
	fmt.Println("કાર્યક્રમ બંધ કરવા q/Q નું ચયન કરો")
}

func beSankhyaLo(pr *float32, bi *float32) {
	fmt.Print("પ્રથમ સંખ્યા લખો : ")
	fmt.Scan(pr)
	fmt.Print("બીજી સંખ્યા લખો : ")
	fmt.Scan(bi)
}

func sarvalo(pr *float32, bi *float32) {
	var parinam float32
	parinam = *pr + *bi

	fmt.Printf("%.2f + %.2f = %.2f\n", *pr, *bi, parinam)
}

func main() {
	sahaay()

	var nikalo bool = false
	var pratham float32
	var biji float32

	for nikalo != true {
		var vikalp string

		fmt.Scan(&vikalp)
		fmt.Println("ચયન કરેલો વિકલ્પ : " + vikalp)

		vikalp = strings.ToLower(vikalp)

		switch vikalp {
		case "q":
			nikalo = true

		case "+":
			beSankhyaLo(&pratham, &biji)
			sarvalo(&pratham, &biji)

		/*case "-":
			baadbaki()

		case "x":
			gunakar()

		case "/":
			bhagakar()

		case "%":
			takaa()

		case "?":
			shesh()*/

		default:
			fmt.Printf("ચયન કરેલો વિકલ્પ \"%s\" અજાણ્યો છે.\n", vikalp)
		}

		fmt.Print("નવા વિકલ્પનું ચયન કરો : ")
	}

	fmt.Println("કાર્યક્રમ કેવો રહ્યો એ અંગે પ્રતિભાવ આપશો! ધન્યવાદ!")
}
