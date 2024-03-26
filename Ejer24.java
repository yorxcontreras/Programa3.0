import java.util.Scanner;

public class Ejer24 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 24"); 
 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10):");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        System.out.println("A nota final do estudante é: " + notaFinal);

        scanner.close();
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
     
        double pesoLaboratorio = 2;
        double pesoSemestral = 3;
        double pesoExameFinal = 5;

        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);

        return notaFinal;
    }
}