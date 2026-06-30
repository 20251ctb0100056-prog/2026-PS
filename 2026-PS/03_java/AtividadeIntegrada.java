import java.util.ArrayList;

public class AtividadeIntegrada {

    public static void main(String[] args) {
        // Testes rápidos das funções
        double[] notas = {7.0, 4.0, 9.0, 6.0};
        System.out.println("Média: " + calcularMedia(notas));
        System.out.println("Aprovados: " + contarAprovados(notas));

        ArrayList<String> catalogo = new ArrayList<>();
        gerenciarCatalogo(catalogo, "Adicionar", "Notebook");
        gerenciarCatalogo(catalogo, "Listar", "");

        int[] valores = {12, 45, 7, 89, 23};
        System.out.println("Maior array: " + maiorValor(valores));
        System.out.println("Maior dois: " + maiorValor(15, 50));

        exibirBoletim(notas);
    }

    public static double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) return 0.0;
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static int contarAprovados(double[] notas) {
        if (notas == null) return 0;
        int aprovados = 0;
        for (double nota : notas) {
            if (nota >= 6.0) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static void gerenciarCatalogo(ArrayList<String> lista, String acao, String produto) {
        if (lista == null || acao == null) return;
        
        switch (acao.toLowerCase()) {
            case "adicionar":
                if (!produto.trim().isEmpty() && !lista.contains(produto)) {
                    lista.add(produto);
                }
                break;
            case "remover":
                lista.remove(produto);
                break;
            case "listar":
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println((i + 1) + ". " + lista.get(i));
                }
                break;
        }
    }

    public static int maiorValor(int[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException();
        }
        int maior = valores[0];
        for (int valor : valores) {
            if (valor > maior) maior = valor;
        }
        return maior;
    }

    public static int maiorValor(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static void exibirBoletim(double[] notas) {
        double media = calcularMedia(notas);
        int totalAprovados = contarAprovados(notas);
        String situacao = (media >= 6.0) ? "APROVADA" : "EM RECUPERACAO";
        
        System.out.println("Média Final: " + media);
        System.out.println("Total Aprovados: " + totalAprovados);
        System.out.println("Situação: " + situacao);
    }
}