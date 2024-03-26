import java.util.Scanner;

public class Ejer22 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 22"); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite o consumo em KW/h:");
        double consumoKWh = scanner.nextDouble();

        double valorKWh;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.602;
                break;
            case 2:
                valorKWh = 0.483;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return;
        }

        double valorConta = consumoKWh * valorKWh;

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        scanner.close();
    }
}