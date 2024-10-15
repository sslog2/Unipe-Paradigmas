package main

import "fmt"

type Calculadora struct{}

func (c Calculadora) Somar(numeros ...int) string {
	if len(numeros) < 2 {
		return "Informe ao menos dois números."
	}
	soma := 0
	for _, num := range numeros {
		soma += num
	}
	return fmt.Sprintf("%d", soma)
}

func main() {
	calc := Calculadora{}
	fmt.Println(calc.Somar(2, 3))
	fmt.Println(calc.Somar(2, 3, 4))
	fmt.Println(calc.Somar(50))
}
