package exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;
        boolean ehTriangulo;

        System.out.println("Digite os 3 lados:");
        lado1 = entrada.nextInt();
        lado2 = entrada.nextInt();
        lado3 = entrada.nextInt();

        // && = E ==> (c1) && (c2) && (c3)
        // verificar se é um triângulo
        ehTriangulo = (lado1 <= lado2 + lado3) && 
                      (lado2 <= lado1 + lado3) && 
                      (lado3 <= lado2 + lado1);

        // classificar se for um triângulo
        if (ehTriangulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else {
                if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                    System.out.println("Triângulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        entrada.close();
    }
}
