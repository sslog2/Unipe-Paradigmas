package main

import "fmt"

type Animal interface {
	Som() string
}

type Cachorro struct{}

func (c Cachorro) Som() string {
	return "Au au"
}

type Gato struct{}

func (g Gato) Som() string {
	return "Miau"
}

func fazerSom(a Animal) {
	fmt.Println(a.Som())
}

func main() {
	cachorro := Cachorro{}
	gato := Gato{}

	fazerSom(cachorro)
	fazerSom(gato)
}

