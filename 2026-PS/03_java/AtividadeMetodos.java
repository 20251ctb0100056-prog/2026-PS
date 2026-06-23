/* Bruno de Paula
23/06/26
*/

import java.util.Scanner;

public class AtividadeMetodos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean manterMenuAtivo = true;

        while (manterMenuAtivo) {
            System.out.println("\n===========================");
            System.out.println("   5 testes   ");
            System.out.println("===========================");
            System.out.println("1 - Problema 1 (Desconto)");
            System.out.println("2 - Problema 2 (Maior Número)");
            System.out.println("3 - Problema 3 (Frete)");
            System.out.println("4 - Problema 4 (Sobrecarga Soma)");
            System.out.println("5 - Problema 5 (Sobrecarga Cardápio)");
            System.out.println("6 - Sair");
            System.out.println("===========================");

            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- PROBLEMA 1 ---");
                    System.out.println("Resultado 1: " + calcularDesconto(100.0, 10.0));
                    System.out.println("Resultado 2: " + calcularDesconto(250.0, 20.0));
                    System.out.println("Resultado 3: " + calcularDesconto(500.0, 15.0));
                    break;

                case 2:
                    System.out.println("\n--- PROBLEMA 2 ---");
                    System.out.println("Resultado 1: " + maiorNumero(10, 20));
                    System.out.println("Resultado 2: " + maiorNumero(50, 5));
                    System.out.println("Resultado 3: " + maiorNumero(30, 30));
                    break;

                case 3:
                    System.out.println("\n---  PROBLEMA 3 ---");
                    System.out.println("Resultado 1: " + calcularFrete(0.5));
                    System.out.println("Resultado 2: " + calcularFrete(3.0));
                    System.out.println("Resultado 3: " + calcularFrete(8.0));
                    break;

                case 4:
                    System.out.println("\n---  PROBLEMA 4 ---");
                    System.out.println("Resultado 1 (int): " + somar(5, 3));
                    System.out.println("Resultado 2 (double): " + somar(2.5, 3.5));
                    System.out.println("Resultado 3 (int): " + somar(100, 50));
                    break;

                case 5:
                    System.out.println("\n--- PROBLEMA 5 ---");
                    exibirProduto("Refrigerante");
                    exibirProduto("Pizza", 39.90);
                    exibirProduto("Hambúrguer", 22.50);
                    break;

                case 6:
                    manterMenuAtivo = false;
                    System.out.println("\nprograma fechado.");
                    break;

                default:
                    System.out.println("opção invalida");
                    break;
            }
        }

        entrada.close();
    }

    static double calcularDesconto(double valor, double percentual) {
        return valor - (valor * (percentual / 100.0));
    }

    static int maiorNumero(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double calcularFrete(double peso) {
        if (peso <= 1.0) {
            return 10.0;
        } else if (peso <= 5.0) {
            return 20.0;
        } else {
            return 35.0;
        }
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static double somar(double a, double b) {
        return a + b;
    }

    static void exibirProduto(String nome) {
        System.out.println("Produto: " + nome);
    }

    static void exibirProduto(String nome, double preco) {
        System.out.println("Produto: " + nome + "\nPreço: R$ " + String.format("%.2f", preco));
    }
}