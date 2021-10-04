package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int retorno;

        retorno = soma(10, 20); // recebe o retorno do método

        System.out.println("Resultado: " + retorno);

    }

    // recebe dois parâmetros int e retorna um int
    static int soma(int n1, int n2) { 
        int resultado;

        resultado = n1 + n2;

        return resultado; // devolve o tipo declarado no método
    }

 }
