
/*
Bruno de Paula
23/06/26
*/

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("--- EXECUTANDO CASOS DE TESTE ---\n");

        System.out.println("Problema 1 - Calculadora de Desconto");
        System.out.println("Resultado 1: " + calcularDesconto(100.0, 10.0));
        System.out.println("Resultado 2: " + calcularDesconto(250.0, 20.0));
        System.out.println("Resultado 3: " + calcularDesconto(500.0, 15.0));
        System.out.println();

        System.out.println("Problema 2 - Verificador de Maior Valor");
        System.out.println("Resultado 1: " + maiorNumero(10, 20));
        System.out.println("Resultado 2: " + maiorNumero(50, 5));
        System.out.println("Resultado 3: " + maiorNumero(30, 30));
        System.out.println();

        System.out.println("Problema 3 - Sistema de Frete");
        System.out.println("Resultado 1: " + calcularFrete(0.5));
        System.out.println("Resultado 2: " + calcularFrete(3.0));
        System.out.println("Resultado 3: " + calcularFrete(8.0));
        System.out.println();

        System.out.println("Problema 4 - Sobrecarga de Soma");
        System.out.println("Resultado 1 (int): " + somar(5, 3));
        System.out.println("Resultado 2 (double): " + somar(2.5, 3.5));
        System.out.println("Resultado 3 (int): " + somar(100, 50));
        System.out.println();

        System.out.println("Problema 5 - Sistema de Cardápio com Sobrecarga");
        exibirProduto("Refrigerante");
        exibirProduto("Pizza", 39.90);
        exibirProduto("Hambúrguer", 22.50);
        System.out.println();
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