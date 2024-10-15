import java.util.ArrayList;
import java.util.List;

class Escola {
    private String local;
    private List<Professor> professores;

    public Escola(String local) {
        this.local = local;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public String getLocal() {
        return local;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}

class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
    }

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }
}

public class main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Carlos");
        Professor professor2 = new Professor("Marcio");

        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);
        escola2.adicionarProfessor(professor1);
        escola2.adicionarProfessor(professor2);

        professor1.adicionarEscola(escola1);
        professor1.adicionarEscola(escola2);

        System.out.println("Escola: " + escola1.getLocal() + " tem professores:");
        for (Professor prof : escola1.getProfessores()) {
            System.out.println(prof.getNome());
        }

        System.out.println("Escola: " + escola2.getLocal() + " tem professores:");
        for (Professor prof : escola2.getProfessores()) {
            System.out.println(prof.getNome());
        }

        System.out.println("Professor: " + professor1.getNome() + " leciona nas escolas:");
        for (Escola escola : professor1.getEscolas()) {
            System.out.println(escola.getLocal());
        }
    }
}
