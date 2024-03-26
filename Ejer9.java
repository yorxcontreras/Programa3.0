import java.util.Scanner;

public class Ejer9 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 09");

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);

        scanner.close();
    }
}