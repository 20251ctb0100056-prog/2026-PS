public class calculaSoma {
    static int calcularSoma(int[] numeros){
        int soma = 0;
        for (int n : numeros) {
            soma+= n;
        }
        return soma;
    }
}  
/*Esse código em Java recebe uma lista de números inteiros, percorre cada elemento utilizando um
 laço `for-each` para somá-los e retorna o valor total acumulado. */
