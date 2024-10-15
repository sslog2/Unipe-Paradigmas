class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto somar(Produto outro) {
        String novoNome = this.nome + " e " + outro.nome;
        double novoPreco = this.preco + outro.preco;
        return new Produto(novoNome, novoPreco);
    }

    public void imprimir() {
        System.out.printf("%s: R$%.2f\n", this.nome, this.preco);
    }
}

public class main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 50);
        Produto produto2 = new Produto("Produto B", 30);
        Produto produto3 = new Produto("Produto C", 30);

        Produto soma = produto1.somar(produto2).somar(produto3);
        soma.imprimir();
    }
}
