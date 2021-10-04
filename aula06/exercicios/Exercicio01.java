package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro:");
        numero = entrada.nextInt();
        entrada.close();

        if(ehPar(numero)) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
    }

    static boolean ehPar(int numero) {
        if(numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ehPar2(int numero) {
/*      if(numero % 2 == 0) {
            return true;
        } 
        return false; */

        return ( (numero % 2) == 0); 

    }

}
