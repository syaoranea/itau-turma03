package exercicios.exercicio01;

public class Placar {
    private String nomeTimeCasa, nomeTimeVisitante;
    private int golsTimeCasa, golsTimeVisitante;

    public Placar() {
        this("Time da casa", "Visitante", 0, 0);
    }

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this(nomeTimeCasa, nomeTimeVisitante, 0, 0);
    }

    public Placar(String nomeTimeCasa, String nomeTimeVisitante, int golsTimeCasa, int golsTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.golsTimeCasa = golsTimeCasa;
        this.golsTimeVisitante = golsTimeVisitante;
    }

    public String toString() {
        return nomeTimeCasa + " " + golsTimeCasa + " X " + golsTimeVisitante + " " + nomeTimeVisitante;
    }
}
