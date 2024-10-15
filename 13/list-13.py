class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            raise ValueError("Negativos não têm fatorial.")
        return 1 if n in (0, 1) else n * Matematica.fatorial(n - 1)

def main():
    numero = int(input('digite o numero: '))
    fatorial = Matematica.fatorial(numero)
    print(f"O fatorial de {numero} é {fatorial}")

if __name__ == "__main__":
    main()
