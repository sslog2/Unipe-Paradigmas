from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self) -> str:
        pass

class Relatorio(Imprimivel):
    def imprimir(self) -> str:
        return "Imprimindo o relatório..."

class Contrato(Imprimivel):
    def imprimir(self) -> str:
        return "Imprimindo o contrato..."

def processar_impressao(imprimivel: Imprimivel):
    print(imprimivel.imprimir())

def main():
    relatorio = Relatorio()
    contrato = Contrato()

    processar_impressao(relatorio)  
    processar_impressao(contrato)

if __name__ == "__main__":
    main()