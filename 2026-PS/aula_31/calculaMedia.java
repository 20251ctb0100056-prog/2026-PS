public class calculaMedia{
    static double calcularMedia(int[] numeros) {
            double soma = 0;
            for (int i = 0;i< numeros.length; i++) {
                soma += numeros[i];
            }
            return soma / numeros.length;
    }
}
/*Esse código Java recebe uma lista de números inteiros, soma todos os seus valores usando um 
laço de repetição (`for`) e divide o total pela quantidade de elementos para retornar a média aritmética exata (com casas decimais).*/