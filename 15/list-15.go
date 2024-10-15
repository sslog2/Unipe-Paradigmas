package main

import (
	"errors"
	"fmt"
)

type SaldoInsuficienteException struct {
	message string
}

func (e *SaldoInsuficienteException) Error() string {
	return e.message
}

type ContaBancaria struct {
	titular string
	saldo   float64
}

func NovaContaBancaria(titular string, saldoInicial float64) *ContaBancaria {
	return &ContaBancaria{
		titular: titular,
		saldo:   saldoInicial,
	}
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
	}
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.saldo {
		return &SaldoInsuficienteException{message: "Saldo insuficiente"}
	}
	c.saldo -= valor
	return nil
}

func (c *ContaBancaria) ConsultarSaldo() float64 {
	return c.saldo
}

func main() {
	conta := NovaContaBancaria("João", 1000)
	sacar := conta.Sacar(1200)
	if sacar != nil {
		var saldoErr *SaldoInsuficienteException
		if errors.As(sacar, &saldoErr) {
			fmt.Println("Erro:", saldoErr)
		}
	}

	conta.Depositar(500)
	sacar = conta.Sacar(800)
	if sacar == nil {
		fmt.Printf("Saldo final: R$%.2f\n", conta.ConsultarSaldo())
	}
}
