package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, cont;

        System.out.println("Qual a tabuada?");
        numero = scanner.nextInt();

        cont = 0;
        while(cont <= 10) {
            System.out.printf("%d x %2d = %02d\n", numero, cont, numero * cont);
            cont++;
        }

        scanner.close();
    }
}
