package main

import "fmt"

type Imprimivel interface {
	Imprimir() string
}

type Relatorio struct{}

func (r Relatorio) Imprimir() string {
	return "Imprimindo o relatório..."
}

type Contrato struct{}

func (c Contrato) Imprimir() string {
	return "Imprimindo o contrato..."
}

func processarImpressao(imprimivel Imprimivel) {
	fmt.Println(imprimivel.Imprimir())
}

func main() {
	relatorio := Relatorio{}
	contrato := Contrato{}

	processarImpressao(relatorio)
	processarImpressao(contrato)
}
