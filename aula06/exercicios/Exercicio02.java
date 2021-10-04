package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(menor(1, 2, 3));
        System.out.println(menor(3, 1, 3));
        System.out.println(menor(3, 1, 1));
    }


    static int menor(int n1, int n2, int n3) {
        if(n1 <= n2 && n2 <= n3) {
            return n1;
        } else {
            if(n2 <= n1 && n1 <= n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }

    static int menor2(int n1, int n2, int n3) {
        int menor;

        menor = n1;

        if(n2 < menor) {
           menor = n2; 
        }

        if(n3 < menor) {
            menor = n3;
        }

        return menor;
    }
}
