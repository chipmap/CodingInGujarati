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

func main() {
	sahaay()

	var nikalo bool = false

	for nikalo != true {
		var vikalp string

		fmt.Scan(&vikalp)
		fmt.Println("ચયન કરેલો વિકલ્પ : " + vikalp)

		if strings.Compare(strings.ToLower(vikalp), "q") == 0 {
			nikalo = true
		}
	}

	fmt.Println("કાર્યક્રમ કેવો રહ્યો એ અંગે પ્રતિભાવ આપશો! ધન્યવાદ!")
}
