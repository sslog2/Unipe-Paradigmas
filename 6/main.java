class Motor {
    private String modelo;

    public Motor(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

class Carro {
    private String marca;
    private Motor motor;

    public Carro(String marca, Motor motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public String detalhes() {
        return "O carro da marca " + marca + " tem um motor " + motor.getModelo();
    }
}

public class main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8");
        Carro carro = new Carro("Volkswagen", motor);
        System.out.println(carro.detalhes());
    }
}
