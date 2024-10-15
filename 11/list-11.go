package main

import "fmt"

type Funcionario interface {
	calcularSalario() float64
}

type FuncionarioHorista struct {
	horasTrabalhadas int
	valorHora        float64
}

func (fh FuncionarioHorista) calcularSalario() float64 {
	return float64(fh.horasTrabalhadas) * fh.valorHora
}

type FuncionarioAssalariado struct {
	salarioMensal float64
}

func (fa FuncionarioAssalariado) calcularSalario() float64 {
	return fa.salarioMensal
}

func main() {
	funcionarioHorista := FuncionarioHorista{horasTrabalhadas: 160, valorHora: 15.0}
	fmt.Printf("Salário do funcionário horista: R$%.2f\n", funcionarioHorista.calcularSalario())

	funcionarioAssalariado := FuncionarioAssalariado{salarioMensal: 3000.0}
	fmt.Printf("Salário do funcionário assalariado: R$%.2f\n", funcionarioAssalariado.calcularSalario())
}
