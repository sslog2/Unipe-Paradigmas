class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}

public class main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        try {
            conta.sacar(1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        conta.depositar(500);
        
        try {
            conta.sacar(800);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.printf("Saldo final: R$%.2f\n", conta.consultarSaldo());
    }
}
