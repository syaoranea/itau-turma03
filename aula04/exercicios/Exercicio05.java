package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int QTD_NUMEROS = 10; // final = Constante, não muda de valor
        int numero, pares = 0;

        // QTD_NUMEROS = 5; // Nâo pode ser feito, pois é uma constante

        for (int i = 1; i <= QTD_NUMEROS; i++) {
            System.out.printf("Digite o %dº numero: " , i );
            numero = entrada.nextInt();

            if(numero % 2 == 0) {
                pares++;
            }
        }
        System.out.println("O total de pares é " + pares);
        System.out.println("O total de impares é " + (QTD_NUMEROS - pares));

        entrada.close();
    }
}
