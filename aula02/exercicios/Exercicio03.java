package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario;

        // entrada
        System.out.println("Digite o valor do salário:");
        salario = teclado.nextDouble();

        // processamento
        // novoSalario = salario + salario * 0.25;
        novoSalario = salario * 1.25;
        
        // saida
        System.out.println("Novo salário = R$ " + novoSalario);

        teclado.close();
    }
}