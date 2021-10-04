package exercicios.exercicio04;

public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora < 24) {
            this.hora = hora;
        } 
    }

}
