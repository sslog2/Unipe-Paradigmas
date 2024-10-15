class Configuracao:
    _instancia = None 

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls) 
            print("Nova instância criada.")
        return cls._instancia  

def main():
    config = Configuracao() 
    outra_config = Configuracao()
    print(f"É a mesma instância? {config is outra_config}")

if __name__ == "__main__":
    main()
