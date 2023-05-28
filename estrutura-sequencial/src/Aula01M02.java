import java.util.Scanner;

public class Aula01M02 {
    public static void ImprimirDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?:");
        String nome = sc.next();

        System.out.println("Olá " + nome);
    }
}
