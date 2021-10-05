package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 45, 00);

        System.out.println("Hora atual: " + relogio.getHora());
        relogio.setHora(-70);
        System.out.println("Hora atual: " + relogio.getHora());

        relogio.setMinuto(-8);
        System.out.println("Minuto atual: " + relogio.getMinuto());
        
        relogio.exibir();
        System.out.println(relogio.horaAtual());



    }
}
