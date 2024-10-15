package main

import "fmt"

type Matematica struct{}

func (m Matematica) Fatorial(n int) int {
	if n < 0 {
		fmt.Println("Fatorial não existe para números negativos.")
		return -1
	}
	if n == 0 || n == 1 {
		return 1
	}
	return n * m.Fatorial(n-1)
}

func main() {
	m := Matematica{}
	numero := 5
	fmt.Printf("O fatorial de %d é %d\n", numero, m.Fatorial(numero))
}
