import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        String idade = scanner.nextLine();
        System.out.println("O dado antes da conversão é: " + idade.getClass().getName());
        int idadeN = Integer.parseInt(idade);
        System.out.println("O dado depois da conversão é: " + ((Object) idadeN).getClass().getName());
    }
}