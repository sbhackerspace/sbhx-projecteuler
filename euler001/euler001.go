// Steve Phillips / elimisteve
// 2010.12.15

package main

func main() {
	total := 0
	for i := 1; i < 1000; i++ {
		if i%3 == 0 || i%5 == 0 {
			total += i
		}
	}
	println(total)
}
