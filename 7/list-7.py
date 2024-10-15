class Escolas:
    def __init__(self,local):
        self.local = local
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

class Professores:
    def __init__(self, nome):
        self.nome = nome
        self.escola = []

    def adicionar_escola(self, escola):
        self.escola.append(escola)

def main():
    professor1 = Professores("Carlos")
    professor2 = Professores("Marcio")

    escola1 = Escolas("Escola A")
    escola2 = Escolas("Escola B")

    escola1.adicionar_professor(professor1)
    escola1.adicionar_professor(professor2)
    escola2.adicionar_professor(professor1)
    escola2.adicionar_professor(professor2)

    professor1.adicionar_escola(escola1)
    professor1.adicionar_escola(escola2)

    print(f'Escola: {escola1.local} tem professores {[prof.nome for prof in escola1.professores]}')
    print(f'Escola: {escola2.local} tem professores {[prof.nome for prof in escola2.professores]}')

    print(f'Profersor:{professor1.nome} leciona nas escolas {[escola.local for escola in professor1.escola]}')

if __name__ == "__main__":
    main()
