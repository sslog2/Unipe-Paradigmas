interface Imprimivel {
    String imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public String imprimir() {
        return "Imprimindo o relatório...";
    }
}

class Contrato implements Imprimivel {
    @Override
    public String imprimir() {
        return "Imprimindo o contrato...";
    }
}

public class main {
    public static void processarImpressao(Imprimivel imprimivel) {
        System.out.println(imprimivel.imprimir());
    }

    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        Contrato contrato = new Contrato();

        processarImpressao(relatorio);
        processarImpressao(contrato);
    }
}
