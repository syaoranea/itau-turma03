package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite dois números:");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();

        if(n1 > n2) {
            // System.out.println("Em ordem: " + n1 + ", " + n2);
            System.out.printf("Em ordem: %.2f , %.2f\n", n1, n2);
        } else {
            System.out.println("Em ordem: " + n2 + ", " + n1);
        }

        teclado.close();
    }
}
