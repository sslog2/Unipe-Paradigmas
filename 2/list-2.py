class Carro:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidade = 0  
    
    def acelerar(self, valor):
        self.velocidade += valor
        print(f"O carro acelerou. Velocidade atual: {self.velocidade} km/h")
    
    def frear(self, valor):
        self.velocidade -= valor
        if self.velocidade < 0:
            self.velocidade = 0
        print(f"O carro freou. Velocidade atual: {self.velocidade} km/h")
    
    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")

def main():
    meu_carro = Carro("Toyota", "Corolla")
    meu_carro.acelerar(30)
    meu_carro.exibir_velocidade()
    meu_carro.frear(10)
    meu_carro.exibir_velocidade()
    meu_carro.frear(25)
    meu_carro.exibir_velocidade()

if __name__ == "__main__":
    main()
