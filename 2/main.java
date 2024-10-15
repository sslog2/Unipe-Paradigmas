class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        if (this.velocidade >= 10) {
            this.velocidade -= 10;
        }
    }

    public String exibirVelocidade() {
        return "Velocidade atual: " + this.velocidade + " km/h";
    }
}

public class main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.acelerar();
        System.out.println(carro1.exibirVelocidade());
        carro1.frear();
        System.out.println(carro1.exibirVelocidade());
    }
}
