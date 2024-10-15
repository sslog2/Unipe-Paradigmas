import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}

class Empresa {
    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void inserirDadosEmpregado(String nome, String cargo, double salario) {
        empregados.add(new Empregado(nome, cargo, salario));
    }

    public void listarEmpregados() {
        for (Empregado empregado : empregados) {
            System.out.printf("%s, %s, %.2f, %s\n", empregado.getNome(), empregado.getCargo(), empregado.getSalario(), this.nome);
        }
    }
}

public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Dataprev");
        
        empresa.inserirDadosEmpregado("Marcio", "IT", 10000);
        empresa.inserirDadosEmpregado("Roberto", "Programador", 40000);

        empresa.listarEmpregados();
    }
}
