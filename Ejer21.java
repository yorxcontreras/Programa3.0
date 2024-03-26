import java.util.Scanner;

public class Ejer21 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 21");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("O nadador pertence à categoria Infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("O nadador pertence à categoria Infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("O nadador pertence à categoria Juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador pertence à categoria Juvenil B.");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("O nadador pertence à categoria Sênior.");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }

        scanner.close();
    }
}
