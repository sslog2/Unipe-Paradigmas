package main

import "fmt"

type Motor struct {
	modelo string
}

func (m Motor) Detalhes() string {
	return fmt.Sprintf("Modelo do motor: %s", m.modelo)
}

type Carro struct {
	marca string
	motor Motor
}

func (c Carro) Detalhes() string {
	return fmt.Sprintf("Marca: %s, %s", c.marca, c.motor.Detalhes())
}

func main() {
	motor := Motor{modelo: "v8"}
	carro := Carro{motor: motor, marca: "Fusca"}

	fmt.Println(carro.Detalhes())
}
