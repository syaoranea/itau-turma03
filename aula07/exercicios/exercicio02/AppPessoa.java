package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        // uma classe abstrata não pode gerar objetos
        // Pessoa p = new Pessoa("Davi", "11 2345-6789");
        Estudante e = new Estudante("Gabriel", "11 98765-0987", "Computação");
        Professor pr = new Professor("Ana", "11 90987-9876", 2000);

        // System.out.println(p);
        System.out.println(e);
        System.out.println(pr);

        // Por meio da herança e da aplicação de polimorfismo podemos fazer isso:
        // criar um vetor do tipo da classe base e todos os "filhos" que herdam da classe base
        // podem ser colocados no mesmo vetor.

        Pessoa[] vetor = new Pessoa[3];

        vetor[0] = new Estudante("José", "9999999", "Gastronomia");
        vetor[1] = new Estudante("Marcos", "111111", "Gastronomia");
        vetor[2] = new Professor("Marcelo", "22222", 1000);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
