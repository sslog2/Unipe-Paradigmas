class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregado = []

    def inserir_dados_empregado(self, nome, cargo, salario):
        self.empregado.append(Empregado(nome, cargo, salario))

    def listar_empresa(self):
        for empregado in self.empregado:
            print(empregado.nome, empregado.cargo, empregado.salario, self.nome)

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

def main():
    empresa = Empresa("Dataprev")
    
    empresa.inserir_dados_empregado("Marcio", "IT", 10000)
    empresa.inserir_dados_empregado("Roberto", "Programador", 40000)

    empresa.listar_empresa()

if __name__ == "__main__":
    main()
