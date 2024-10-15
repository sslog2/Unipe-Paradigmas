package main

import "fmt"

type Produto struct {
	nome  string
	preco float64
}

func (p Produto) Somar(outro Produto) float64 {
	return p.preco + outro.preco
}

func main() {
	produto1 := Produto{nome: "Produto A", preco: 10.50}
	produto2 := Produto{nome: "Produto B", preco: 20.30}

	total := produto1.Somar(produto2)

	fmt.Printf("A soma dos preços dos produtos é: R$%.2f\n", total)
}
