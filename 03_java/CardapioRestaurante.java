/* Bruno de Paula
02/06/2026 */

import java.util.Scanner;

public class CardapioRestaurante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;
        int quantidade;
        double preco = 0;
        String produto = "";

        System.out.println("=================================");
        System.out.println("       CARDÁPIO ELETRÔNICO");
        System.out.println("=================================");
        System.out.println("1 - X-Burguer .......... R$ 18,00");
        System.out.println("2 - Pizza .............. R$ 35,00");
        System.out.println("3 - Suco Natural ....... R$ 8,00");
        System.out.println("4 - Café ............... R$ 5,00");
        System.out.println("=================================");

        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();

        if (opcao == 1) {
            produto = "X-Burguer";
            preco = 18.00;
        } else if (opcao == 2) {
            produto = "Pizza";
            preco = 35.00;
        } else if (opcao == 3) {
            produto = "Suco Natural";
            preco = 8.00;
        } else if (opcao == 4) {
            produto = "Café";
            preco = 5.00;
        } else {
            System.out.println("Opção inválida.");
            entrada.close();
            return;
        }

        System.out.print("Digite a quantidade desejada: ");
        quantidade = entrada.nextInt();

        double total = preco * quantidade;

        System.out.println("\n========== RESUMO DO PEDIDO ==========");
        System.out.println("Produto: " + produto);
        System.out.println("Preço unitário: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + total);
        System.out.println("======================================");

        entrada.close();
    }
}