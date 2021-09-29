package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        String nome = "emerson";

        // if (nome.equals("Emerson")) {
        if (nome.equalsIgnoreCase("Emerson")) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

    }
}
