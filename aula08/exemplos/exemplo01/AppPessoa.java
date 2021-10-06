package exemplos.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua X", 123);
        Pessoa p = new Pessoa("Andre");
        Pessoa p2 = new Pessoa("Ana", e);
        Pessoa p3 = new Pessoa("Rodrigo", "RUA W", 321);

        //p.setEndereco(e);
        p.exibir();
        p2.exibir();
        p3.exibir();
    }
}
