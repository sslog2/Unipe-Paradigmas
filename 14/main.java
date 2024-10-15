class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        System.out.println("Nova instância criada.");
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}

public class main {
    public static void main(String[] args) {
        Configuracao config = Configuracao.getInstancia();
        Configuracao outraConfig = Configuracao.getInstancia();
        System.out.println("É a mesma instância? " + (config == outraConfig));
    }
}
