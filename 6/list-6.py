class Motor:
    def __init__(self, modelo):
        self.modelo = modelo

class Carro:
    def __init__(self, marca, motor): 
        self.marca = marca
        self.motor = motor 

    def detalhes(self):
        return f"O carro da marca {self.marca} tem um motor {self.motor.modelo}"

def main():
    motor = Motor("V8")  
    carro = Carro("Volkswagen", motor) 

    print(carro.detalhes())  

if __name__ == "__main__":
    main()
