class Animal:
    def som(self) -> str:
        return "som que animal faz"

class Cachorro(Animal):
    def som(self) -> str:
        return "Au au"

class Gato(Animal):
    def som(self) -> str:
        return "Miau"

def fazer_som(animais):
    for animal in animais:
        print(animal.som())

def main():
    animais = [Cachorro(), Gato()]
    fazer_som(animais)

if __name__ == "__main__":
    main()
