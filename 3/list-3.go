package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	nome string
	saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor <= 0 {
		fmt.Println("O valor do depósito deve ser positivo.")
		return
	}
	c.saldo += valor
	fmt.Printf("Depositado: R$%.2f\n", valor)
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor <= 0 {
		return errors.New("o valor de saque deve ser positivo")
	}
	if valor > c.saldo {
		return errors.New("saldo insuficiente")
	}
	c.saldo -= valor
	fmt.Printf("Sacado: R$%.2f\n", valor)
	return nil
}

func (c *ContaBancaria) Saldo() float64 {
	return c.saldo
}

func main() {
	conta := ContaBancaria{"Marcio", 1000.0} 

	fmt.Printf("Saldo inicial de %s: R$%.2f\n", conta.nome, conta.Saldo())

	conta.Depositar(500)
	fmt.Printf("Saldo após depósito: R$%.2f\n", conta.Saldo())

	if err := conta.Sacar(200); err != nil {
		fmt.Println("Erro ao sacar:", err)
	} else {
		fmt.Printf("Saldo após saque: R$%.2f\n", conta.Saldo())
	}

	if err := conta.Sacar(1500); err != nil {
		fmt.Println("Erro ao sacar:", err)
	}

	fmt.Printf("Saldo final: R$%.2f\n", conta.Saldo())
}

