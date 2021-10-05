package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios) {
        // super chama o construtor da superclasse
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }

    // Overload
    public Gerente(String nome) {
        super(nome, 0);
    }

    // @ é uma anotação
    // @Override indica que o método foi sobrescrito
    @Override
    public void exibir() {
        System.out.println(getNome() + " - " + getSalario() + " - " + numFuncionarios);
    }

    @Override
    public void aumentaSalario(double porcentagem) {
        // chama o método da superClasse (Funcionario)
        super.aumentaSalario(porcentagem + 20);
        ;
    }

/*     @Override
    public String toString() {
        return super.getNome() + ": R$ " + super.getSalario() + " Numero de funcionários: " + numFuncionarios;
    } */

    @Override
    public String toString() { 
        return super.toString() + " Numero Funcionario : " +  numFuncionarios;
    };

}
