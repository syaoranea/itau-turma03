package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, prestacao, limite;

        System.out.println("Informe o valor do salário bruto:");
        salarioBruto = teclado.nextDouble();
        System.out.println("Informe o valor da prestação:");
        prestacao = teclado.nextDouble();

        limite = salarioBruto * 0.3;

        if(prestacao <= limite) {
            System.out.println("Pode receber o emprestimo.");
        } else {
            System.out.println("Não pode receber o emprestimo.");
        }

        teclado.close();
    }
}
