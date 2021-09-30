package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, cont;

        soma = 0;
        cont = 1;
        numero = 1;
        while (numero != 0) {  
            System.out.printf("Digite o %dº número (0=fim): ", cont++);
            numero = entrada.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma = " + soma);

        entrada.close();
    }
}
