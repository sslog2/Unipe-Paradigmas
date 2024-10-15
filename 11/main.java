abstract class Funcionario {
    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

public class main {
    public static void main(String[] args) {
        Funcionario funcionarioHorista = new FuncionarioHorista(160, 15.0);
        System.out.printf("Salário do funcionário horista: R$%.2f\n", funcionarioHorista.calcularSalario());

        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(3000.0);
        System.out.printf("Salário do funcionário assalariado: R$%.2f\n", funcionarioAssalariado.calcularSalario());
    }
}