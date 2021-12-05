// કૉપીરાઇટ (c) ૨૦૨૧ ચિરાગ પટેલ
//
// 11, 22, 33, 44...
// 101, 111, 121, 131, 141,...
// 202, 212, 222, 232, 242,...
// 303...
// ...
// 1001, 1111, 1221, 1331, ...
// ...
// 101 - chhe
// 123 - nathi

package main

import (
	"fmt"
	"os"
)

func main() {
	argc := len(os.Args)
	var sankhya string = ""

	if argc < 2 {
		fmt.Println("એક સંખ્યા કે શબ્દ લખો: ")
		fmt.Scanf("%s", &sankhya)
	} else {
		fmt.Printf("કુલ આરગ %d\n", argc)
		sankhya = os.Args[1]
	}

	var palindrome bool = true
	var len int = len(sankhya)
	fmt.Printf("શબ્દ: \"%s\" કુલ અક્ષર: %d\n", sankhya, len)
	for idx := 0; (idx < len/2) && (palindrome == true); idx++ {
		if sankhya[idx] != sankhya[len-idx-1] {
			palindrome = false
			break
		}
	}

	var parinam string
	if palindrome == true {
		parinam = "છે"
	} else {
		parinam = "નથી"
	}
	fmt.Printf("\"%s\" પેલિન્ડ્રૉમ %s\n", sankhya, parinam)
}
