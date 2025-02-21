import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Criando um objeto entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        
        scanner.close();
    }
}
