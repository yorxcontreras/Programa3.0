import java.util.Scanner;

public class Ejer13 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 13");

        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int totalAptas = 0;
        int totalInaptas = 0;

        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            scanner.nextLine(); 

            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Sexo (M para masculino, F para feminino):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Idade:");
            int idade = scanner.nextInt();

            System.out.println("Saúde (A para apto, I para inapto):");
            char saude = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'M' && idade >= 18 && saude == 'A') {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalAptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalInaptas++;
            }

            totalPessoas++;
        }

        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Total aptas para o serviço militar obrigatório: " + totalAptas);
        System.out.println("Total inaptas para o serviço militar obrigatório: " + totalInaptas);

        scanner.close();
    }
}