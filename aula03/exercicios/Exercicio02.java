package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite as 2 notas:");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();

        media = nota1 * 0.4 + nota2 * 0.6;

        if(media >= 6) {
            System.out.println("Aprovado! com média " + media);
        } else {
            System.out.println("Repovado...com média " + media);
        }

        teclado.close();
    }
}
