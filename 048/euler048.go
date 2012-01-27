// Steve Phillips / elimisteve
// 2012.01.26

// Problem: http://projecteuler.net/problem=48
// Print last 10 digits of the sum 1**1 + 2**2 + 3**3 + ... + 10**10

package main

import (
    "fmt"
	"math"
)

func main() {
	var total float64

	for i := 0; i < 10; i++ {
		num := float64(i+1)
		total += math.Pow(num, num)
	}

	// Easier float-to-int-as-string conversion than importing strconv
	answer := fmt.Sprintf("%0.f", total)

	// Skip over all but the last 10 digits
	ndx := 0
	if len(answer) > 10 {
		ndx = len(answer) - 10
	}
	fmt.Printf("%v\n", answer[ndx:])
}