package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson", 23);
        Pessoa p2 = new Pessoa("Armando", 32);

        // p.nome = "Emerson";
        // p.idade = 23;
        p.apresentar();

        // p2.nome = "Armando";
        // p2.idade = 32;
        p2.apresentar();
    }

}
