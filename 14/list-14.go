package main

import (
	"fmt"
	"sync"
)

type Configuracao struct{}

var instancia *Configuracao
var once sync.Once

func GetConfiguracao() *Configuracao {
	once.Do(func() {
		fmt.Println("Nova instância criada.")
		instancia = &Configuracao{}
	})
	return instancia
}

func main() {
	config := GetConfiguracao()
	outraConfig := GetConfiguracao()

	fmt.Printf("É a mesma instância? %v\n", config == outraConfig)
}
