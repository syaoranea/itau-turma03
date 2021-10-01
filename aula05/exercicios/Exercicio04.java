package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double media;
        int qtdeMaiorMedia;

        media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1));
            notas[i] = scanner.nextDouble();
            media += notas[i];
        }
        media /= notas.length;

        System.out.println("Notas digitadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia da turma: " + media);

        System.out.println("Notas maiores que a média:");
        qtdeMaiorMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                System.out.print( notas[i] + " ");
                qtdeMaiorMedia++;
            }
        }
        System.out.println("\nQuantidadede notas acima da média: " + qtdeMaiorMedia);
        
        scanner.close();
    }
}
