// Copyright (c) 2021, Chirag Patel
package main

import (
	"fmt"
	"strings"
)

// calculator mate upyogi samooh
type Samooh struct {
	sankhya1 float32
	sankhya2 float32
	parinam  float32
}

// આ વપરાશકર્તાને સહાયક થાય એ માટેનું ફંક્શન છે
func sahaay() {
	fmt.Println("નમસ્તે! કેલ્ક્યુલેટર કાર્યક્રમમાં આપનું સ્વાગત છે!")
	fmt.Println("કોઈ એક પ્રક્રિયાનું ચયન કરો (+ - x / % ?) : ")
	fmt.Println("કાર્યક્રમ બંધ કરવા q/Q નું ચયન કરો")
}

func beSankhyaLo(s *Samooh) {
	fmt.Print("પ્રથમ સંખ્યા લખો : ")
	fmt.Scan(&(s.sankhya1))
	fmt.Print("બીજી સંખ્યા લખો : ")
	fmt.Scan(&(s.sankhya2))
}

func sarvalo(s *Samooh) {
	s.parinam = s.sankhya1 + s.sankhya2
}

func test(s1 float32, s2 float32) (float32, float32, float32, float32) {
	s1 += 10
	s2 += 1
	return s1 + s2, s1 - s2, s1 * s2, s1 / s2
}

func main() {
	sahaay()

	var nikalo bool = false
	samooh := Samooh{sankhya1: 0, sankhya2: 0, parinam: 0}

	for nikalo != true {
		var vikalp string

		fmt.Scan(&vikalp)
		fmt.Println("ચયન કરેલો વિકલ્પ : " + vikalp)

		vikalp = strings.ToLower(vikalp)

		switch vikalp {
		case "q":
			nikalo = true

		case "+":
			beSankhyaLo(&samooh)
			sarvalo(&samooh)

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

		if strings.Compare(vikalp, "q") != 0 {
			fmt.Printf("%.2f %s %.2f = %.2f\n", samooh.sankhya1, vikalp, samooh.sankhya2, samooh.parinam)
		}

		var parinam1, parinam2, parinam3, parinam4 = test(samooh.sankhya1, samooh.sankhya2)
		fmt.Printf("\nટેસ્ટનું પરિણામ = %.2f -- %.2f -- %.2f -- %.2f\n", parinam1, parinam2, parinam3, parinam4)

		fmt.Print("\nનવા વિકલ્પનું ચયન કરો : ")
	}

	fmt.Println("કાર્યક્રમ કેવો રહ્યો એ અંગે પ્રતિભાવ આપશો! ધન્યવાદ!")
}
