public class contarAcima{

static int contaAcima(int[] numeros, int limite){
    int contador = 0;
    for (int n : numeros) {
        if (n > limite) {
            contador++;
        }
    }
    return contador;
}
}
/*Esse código em Java percorre uma lista de números inteiros e conta quantos deles são
 maiores do que o valor `limite` informado, retornando essa quantidade total. */