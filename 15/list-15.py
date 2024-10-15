class SaldoInsuficienteException(Exception):
    pass

class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.titular = titular
        self.saldo = saldo_inicial

    def depositar(self, valor):
        if valor > 0:
            self.saldo += valor

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente")
        self.saldo -= valor

    def consultar_saldo(self):
        return self.saldo

def main():
    conta = ContaBancaria("João", 1000)
    try:
        conta.sacar(1200)
    except SaldoInsuficienteException as e:
        print(f"Erro: {e}")

    conta.depositar(500)
    conta.sacar(800)
    print(f"Saldo final: R${conta.consultar_saldo():.2f}")

if __name__ == "__main__":
    main()
