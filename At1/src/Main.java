import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seja bem-vindo, " + nome + "!");
    }
}