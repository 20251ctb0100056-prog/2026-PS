/* Bruno de Paula
02/06/2026 */

import java.util.Scanner;
import java.util.Random;

public class CardapioRestaurante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random geradorAleatorio = new Random();

        int opcaoSelecionada = 0;
        int quantidadeItens = 0;
        double valorTotalPedido = 0;
        String extratoDaCompra = "";
        boolean manterMenuAtivo = true;

        while (manterMenuAtivo) {
            System.out.println("\n===========================");
            System.out.println("       FAST FOOD DA Pista      ");
            System.out.println("===========================");
            System.out.println("1 - X-imposto ....................R$ 18,00");
            System.out.println("2 - Pizza de carlinhos ...........R$ 35,00");
            System.out.println("3 - Fries do boleia ..... ........R$ 12,00");
            System.out.println("4 - Pinheirense ..................R$ 8,00");
            System.out.println("5 - Sorvetin do loirao ...........R$ 10,00");
            System.out.println("6 - Finalizar Pedido");
            System.out.println("===========================");

            System.out.print("Escolha: ");
            opcaoSelecionada = entrada.nextInt();

            String nomeProduto = "";
            double precoProduto = 0;

            switch (opcaoSelecionada) {
                case 1:
                    nomeProduto = "X-imposto";
                    precoProduto = 18.00;
                    break;
                case 2:
                    nomeProduto = "Pizza de carlinhos";
                    precoProduto = 35.00;
                    break;
                case 3:
                    nomeProduto = "Fries do boleia";
                    precoProduto = 12.00;
                    break;
                case 4:
                    nomeProduto = "Pinheirense";
                    precoProduto = 8.00;
                    break;
                case 5:
                    nomeProduto = "Sorvetin do loirao";
                    precoProduto = 10.00;
                    break;
                case 6:
                    manterMenuAtivo = false;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha um item do cardápio.");
                    continue;
            }

            if (opcaoSelecionada >= 1 && opcaoSelecionada <= 5) {
                System.out.print("Quantidade: ");
                quantidadeItens = entrada.nextInt();

                if (quantidadeItens <= 0) {
                    System.out.println("Quantidade incorreta. Item desconsiderado.");
                } else {
                    double subtotalItem = precoProduto * quantidadeItens;
                    valorTotalPedido += subtotalItem;

                    extratoDaCompra += quantidadeItens + "x " + nomeProduto + " ..... R$ " + String.format("%.2f", subtotalItem) + "\n";
                    System.out.println("\nItem adicionado ao pedido!");
                }

                System.out.println("\nDeseja continuar comprando?");
                System.out.println("1 - Sim");
                System.out.println("2 - Finalizar");
                System.out.print("Escolha: ");
                int proximoPasso = entrada.nextInt();

                if (proximoPasso == 2) {
                    manterMenuAtivo = false;
                }
            }
        }

        if (valorTotalPedido == 0) {
            System.out.println("\nNenhum produto selecionado. Sessão encerrada.");
            entrada.close();
            return;
        }

        System.out.println("\n===========================");
        System.out.println("     RESUMO DO PEDIDO      ");
        System.out.println("===========================");
        System.out.print(extratoDaCompra);
        System.out.println("\nTOTAL: R$ " + String.format("%.2f", valorTotalPedido));
        System.out.println("===========================");

        System.out.println("\nForma de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        System.out.println("3 - PIX");
        System.out.print("Escolha: ");
        int opcaoPagamento = entrada.nextInt();

        if (opcaoPagamento >= 1 && opcaoPagamento <= 3) {
            System.out.println("\nPagamento realizado com sucesso!");
        } else {
            System.out.println("\nOpção de pagamento inválida. Dirija-se ao caixa físico.");
        }

        int codigoIdentificador = geradorAleatorio.nextInt(500) + 1;

        System.out.println("\nPedido Nº " + codigoIdentificador);
        System.out.println("Aguarde a chamada do seu pedido.");

        entrada.close();
    }
}