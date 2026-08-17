import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;
        int quantidade = 0;

        double totalSalarios = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int mulheresAcima5000 = 0;

        do {
            System.out.println("\n===== CENSO SOCIOECONÔMICO =====");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Exibir resultados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {

                System.out.print("Digite a idade: ");
                int idade = entrada.nextInt();

                System.out.print("Digite o sexo (M/F): ");
                char sexo = entrada.next().toUpperCase().charAt(0);

                System.out.print("Digite o salário: R$ ");
                double salario = entrada.nextDouble();

// Quantidade de pessoas
                quantidade++;

// Soma dos salários
                totalSalarios += salario;

// Maior e menor idade
                if (quantidade == 1) {
                    maiorIdade = idade;
                    menorIdade = idade;
                } else {
                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    }

                    if (idade < menorIdade) {
                        menorIdade = idade;
                    }
                }

// Mulheres com salário >= R$ 5.000
                if (sexo == 'F' && salario >= 5000) {
                    mulheresAcima5000++;
                }

                System.out.println("Pessoa cadastrada!");

            } else if (opcao == 2) {

                if (quantidade == 0) {
                    System.out.println("Nenhuma pessoa foi cadastrada.");
                } else {
                    double mediaSalarial = totalSalarios / quantidade;

                    System.out.println("\n===== RESULTADOS =====");
                    System.out.printf("Média salarial: R$ %.2f%n", mediaSalarial);
                    System.out.println("Maior idade: " + maiorIdade);
                    System.out.println("Menor idade: " + menorIdade);
                    System.out.println("Mulheres com salário >= R$ 5.000,00: "
                            + mulheresAcima5000);
                }

            } else if (opcao == 3) {

                System.out.println("Programa encerrado!");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        entrada.close();
    }
}