class Animal:
    def som(self) -> str:
        return "som que animal faz"

class Cachorro(Animal):
    def som(self) -> str:
        return "Au au"

class Gato(Animal):
    def som(self) -> str:
        return "Miau"

def main():
    cachorro = Cachorro()
    gato = Gato()
    print(cachorro.som())
    print(gato.som())

if __name__ == "__main__":
    main()
