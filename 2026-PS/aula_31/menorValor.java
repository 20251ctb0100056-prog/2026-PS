public class menorValor{
static int menoresValores(int[] numeros) {
    int menor = numeros[0];
    int it = 1;
    
    while (it < numeros.length) {
        if (numeros[it] < menor) {
            menor = numeros[it];
        }
        it++;
    }
    
    return menor;
}

}
/*Esse código em Java passa por uma lista de números e descobre qual é o **menor de todos**. Ele começa fingindo que
 o primeiro número é o menor e vai trocando sempre que acha outro menor pelo caminho. */