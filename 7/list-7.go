package main

import (
	"fmt"
)

type Escola struct {
	local       string
	professores []*Professor
}

func (e *Escola) adicionarProfessor(p *Professor) {
	e.professores = append(e.professores, p)
}

type Professor struct {
	nome    string
	escolas []*Escola
}

func (p *Professor) adicionarEscola(e *Escola) {
	p.escolas = append(p.escolas, e)
}

func main() {
	professor1 := &Professor{nome: "Carlos"}
	professor2 := &Professor{nome: "Marcio"}

	escola1 := &Escola{local: "Escola A"}
	escola2 := &Escola{local: "Escola B"}

	escola1.adicionarProfessor(professor1)
	escola1.adicionarProfessor(professor2)
	escola2.adicionarProfessor(professor1)
	escola2.adicionarProfessor(professor2)

	professor1.adicionarEscola(escola1)
	professor1.adicionarEscola(escola2)

	fmt.Printf("Escola: %s tem professores: ", escola1.local)
	for _, prof := range escola1.professores {
		fmt.Printf("%s ", prof.nome)
	}
	fmt.Println()

	fmt.Printf("Escola: %s tem professores: ", escola2.local)
	for _, prof := range escola2.professores {
		fmt.Printf("%s ", prof.nome)
	}
	fmt.Println()

	fmt.Printf("Professor: %s leciona nas escolas: ", professor1.nome)
	for _, escola := range professor1.escolas {
		fmt.Printf("%s ", escola.local)
	}
	fmt.Println()
}
