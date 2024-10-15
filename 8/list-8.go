package main

import "fmt"

type Empresa struct {
	nome      string
	empregado []*Empregado
}

func (e *Empresa) adicionarEmpregado(em *Empregado) {
	e.empregado = append(e.empregado, em)
}

type Empregado struct {
	nome    string
	cargo   string
	salario float64
}

func main() {

	adcionar := &Empregado{nome: "Marcio", cargo: "IT", salario: 12000}
	Empresa := &Empresa{nome: "Dataprev"}

	Empresa.adicionarEmpregado(adcionar)

	fmt.Printf("Empresa: %s tem empregados: ", Empresa.nome)
	for _, em := range Empresa.empregado {
		fmt.Printf("%s com cargo %s e salario %.2f\n", em.nome, em.cargo, em.salario)
	}

}
