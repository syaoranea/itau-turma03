package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt();

        if (numero > 20) {
            int divisor = 2;
            metade = (double)numero / divisor; // casting = "forçar" uma conversão
            System.out.println("A metade é: " + metade);
        }

        entrada.close();
    }
}
