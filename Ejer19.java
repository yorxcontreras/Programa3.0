import java.util.Scanner;

public class Ejer19 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 19");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o comprimento do segundo lado do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o comprimento do terceiro lado do triângulo:");
        int lado3 = scanner.nextInt();

        if (isTriangulo(lado1, lado2, lado3)) {
        
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo isóscele.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        scanner.close();
    }

    public static boolean isTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
    }
}