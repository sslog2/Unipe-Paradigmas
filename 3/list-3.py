class ContaBancaria:
    def __init__(self, titular):
        self.__titular = titular  
        self.__saldo = 0.0        

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor:.2f} realizado com sucesso!")
        else:
            print("Valor de depósito deve ser maior que zero.")

    def sacar(self, valor):
        if valor > 0 and valor <= self.__saldo:
            self.__saldo -= valor
            print(f"Saque de R${valor:.2f} realizado com sucesso!")
        elif valor > self.__saldo:
            print("Saldo insuficiente para realizar o saque.")
        else:
            print("Valor de saque deve ser maior que zero.")

    def exibir_saldo(self):
        print(f"Saldo atual de {self.__titular}: R${self.__saldo:.2f}")
    
def main():

    conta = ContaBancaria("Marcio")
    conta.exibir_saldo()

    conta.depositar(100)
    conta.exibir_saldo()

    conta.sacar(30)
    conta.exibir_saldo()

    conta.sacar(80)
    conta.exibir_saldo()

if __name__ == "__main__":
    main()

