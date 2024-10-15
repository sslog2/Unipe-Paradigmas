from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcularSalario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas_trabalhadas, valor_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcularSalario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario_mensal):
        self.salario_mensal = salario_mensal

    def calcularSalario(self):
        return self.salario_mensal

def main():
    funcionario_horista = FuncionarioHorista(horas_trabalhadas=160, valor_hora=15.0)
    print(f"Salário do funcionário horista: R${funcionario_horista.calcularSalario()}")

    funcionario_assalariado = FuncionarioAssalariado(salario_mensal=3000.0)
    print(f"Salário do funcionário assalariado: R${funcionario_assalariado.calcularSalario()}")

if __name__ == "__main__":
    main()
