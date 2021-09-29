package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;
        boolean senhaValida; // armazena true ou false

        System.out.println("Digite sua senha:");
        senha = teclado.nextLine();

        // equals = exatamente igual ( Emerson e emerson são diferentes)
        // equalsIgnoreCase = desconsidera maiúsculas e minusculas (Emerson e emerson são iguais)

        senhaValida = senha.equals("R10p5");

        if(senhaValida) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        teclado.close();
    }

}
