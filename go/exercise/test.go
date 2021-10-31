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

import "fmt"

func main() {
	fmt.Println("એક સંખ્યા લખો: ")

	var sankhya int32 = 0
	fmt.Scanf("%d", &sankhya)

	var palindrome bool = false
	if sankhya > 10 && sankhya < 100 {
		palindrome = ((sankhya % 11) == 0)
	}

	var parinam string
	if palindrome == true {
		parinam = "છે"
	} else {
		parinam = "નથી"
	}
	fmt.Printf("સંખ્યા %d પેલિન્ડ્રૉમ %s\n", sankhya, parinam)
}
