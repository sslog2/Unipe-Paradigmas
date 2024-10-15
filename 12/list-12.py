class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outro):
        return Produto(f"{self.nome} e {outro.nome}", self.preco + outro.preco)

    def imprimir(self):
        print(f"{self.nome}: R${self.preco:.2f}")

def main():
    produto1 = Produto("Produto A", 50)
    produto2 = Produto("Produto B", 30)
    produto3 = Produto("Produto C", 30)

    soma = produto1 + produto2 + produto3
    soma.imprimir()

if __name__ == "__main__":
    main()
