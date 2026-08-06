public class maiorValor {
    static int maioresValor(int[] numeros) {
    int maior = numeros[0];
    for (int n : numeros) {
        if (n > maior) {
            maior = n;
        }
    }
    return maior;
}

} /*Esse código em Java passa por uma lista de números e descobre qual é o **maior de todos**. Ele começa fingindo que
 o primeiro número é o maior e vai trocando sempre que acha outro maior pelo caminho. */