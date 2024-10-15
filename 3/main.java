class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Valor de depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valor);
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque deve ser maior que zero.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: R$%.2f\n", this.titular, this.saldo);
    }
}

public class main { 
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Marcio");
        conta.exibirSaldo();

        conta.depositar(100);
        conta.exibirSaldo();

        conta.sacar(30);
        conta.exibirSaldo();

        conta.sacar(80);
        conta.exibirSaldo();
    }
}