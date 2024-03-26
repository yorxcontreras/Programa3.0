import java.util.Scanner;

public class Ejer2 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 02");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida em quilometros:");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto em litros:");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("O consumo medio do automóvel e: " + consumoMedio + " km/l");

        scanner.close();
    }
}
