import java.util.Scanner;

public class Ejer26 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 26");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
            return;
        }

        System.out.println("Digite o grupo de risco do pretendente (Baixo, Médio, Alto):");
        String grupoRisco = scanner.next().toLowerCase();

        int categoriaSeguro = determinarCategoriaSeguro(idade, grupoRisco);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria de seguro: " + categoriaSeguro);

        scanner.close();
    }

    public static int determinarCategoriaSeguro(int idade, String grupoRisco) { 
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "baixo":
                    return 1;
                case "médio":
                    return 2;
                case "alto":
                    return 3;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "baixo":
                    return 2;
                case "médio":
                    return 3;
                case "alto":
                    return 4;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "baixo":
                    return 3;
                case "médio":
                    return 4;
                case "alto":
                    return 5;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "baixo":
                    return 4;
                case "médio":
                    return 5;
                case "alto":
                    return 6;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "baixo":
                    return 7;
                case "médio":
                    return 8;
                case "alto":
                    return 9;
            }
        }

        return -1; 
    }
}