package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        // %d números inteiros

        System.out.printf("%d\n", 3);
        System.out.printf("%2d\n", 3); // 2 - duas casas para exibir
        System.out.printf("%02d\n", 3); // 0 - o valor que vai preencher quanto tiver menos dígitos

        System.out.printf("%d %d\n", 3, 4); // \n = pular para a próxima linha

        System.out.println();

        // %f - números não inteiros
        // %.Yf - Y número de casas decimais
        System.out.printf("%.2f\n", 4.543);
    }
}
