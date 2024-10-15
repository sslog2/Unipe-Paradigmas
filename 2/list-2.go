package main

import "fmt"

type Carro struct {
	Marca      string
	Modelo     string
	Ano        int
	Velocidade int
}

func (c *Carro) Acelerar() {
	c.Velocidade += 10
}

func (c *Carro) Frear() {
	if c.Velocidade >= 10 {
		c.Velocidade -= 10
	}
}

func (c *Carro) ExibirVelocidade() string {
	return fmt.Sprintf("Velocidade atual: %d km/h", c.Velocidade)
}

func main() {
	carro := Carro{
		Marca:      "Toyota",
		Modelo:     "Corolla",
		Ano:        2020,
		Velocidade: 0,
	}

	carro.Acelerar()
	fmt.Println(carro.ExibirVelocidade())

	carro.Frear()
	fmt.Println(carro.ExibirVelocidade())
}
