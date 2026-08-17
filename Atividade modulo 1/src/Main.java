import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int opcao;
        String continuar;

        do {
            System.out.println("\n===== SABOR & ARTE =====");
            System.out.println("1 - Picanha .......... R$ 25,00");
            System.out.println("2 - Lasanha .......... R$ 20,00");
            System.out.println("3 - Strogonoff ....... R$ 18,00");
            System.out.println("4 - Bife acebolado ... R$ 15,00");
            System.out.println("5 - Pão com ovo ...... R$ 5,00");
            System.out.print("Escolha o código do prato: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total += 25.00;
                    System.out.println("Picanha adicionada!");
                    break;

                case 2:
                    total += 20.00;
                    System.out.println("Lasanha adicionada!");
                    break;

                case 3:
                    total += 18.00;
                    System.out.println("Strogonoff adicionado!");
                    break;

                case 4:
                    total += 15.00;
                    System.out.println("Bife acebolado adicionado!");
                    break;

                case 5:
                    total += 5.00;
                    System.out.println("Pão com ovo adicionado!");
                    break;

                default:
                    System.out.println("Código inválido!");
            }

            System.out.print("Deseja adicionar outro prato? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.printf("%nTotal a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}