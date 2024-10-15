import java.util.Scanner;

class Matematica {
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negativos não têm fatorial.");
        }
        return (n == 0 || n == 1) ? 1 : n * fatorial(n - 1);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();
        
        try {
            long fatorial = Matematica.fatorial(numero);
            System.out.printf("O fatorial de %d é %d\n", numero, fatorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
