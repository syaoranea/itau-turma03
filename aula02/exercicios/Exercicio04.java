package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, valorKW, valorTotal, valorComDesconto;
        int qtdeKWConsumido;

        // entrada
        System.out.println("Informe o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Quantos KW foram consumidos?");
        qtdeKWConsumido = entrada.nextInt();

        // processamento
        valorKW = salarioMinimo / 500;
        valorTotal = valorKW * qtdeKWConsumido;
        valorComDesconto = valorTotal * 0.85;

        // saída
        System.out.printf("Valor por KW: R$ %.2f\n", valorKW);
        System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);
        System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);

        entrada.close();
    }
}
