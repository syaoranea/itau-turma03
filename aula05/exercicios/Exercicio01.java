package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, maior, menor;

        maior = Integer.MIN_VALUE; // O menor inteiro possível
        menor = Integer.MAX_VALUE; // O maior inteiro possível

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        entrada.close();
    }

}
