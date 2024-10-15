class Calculadora:
    def somar(self, *numeros):
        if len(numeros) < 2:
            return "Informe ao menos dois números."
        return sum(numeros)
def main():
    calc = Calculadora()
    print(calc.somar(2, 3))          
    print(calc.somar(2, 3, 4))       
    print(calc.somar(5))             
if __name__ == "__main__":
    main()