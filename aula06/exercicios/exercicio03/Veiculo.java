package exercicios.exercicio03;

public class Veiculo {
    String modelo, marca;
    private double consumo; // restringindo o acesso

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    public void exibir() {
        System.out.println("Modelo: "+ modelo + " Marca: " + marca);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0){
            consumo = novoConsumo;
        }
    }

}
