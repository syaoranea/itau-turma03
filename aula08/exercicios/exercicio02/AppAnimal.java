package exercicios.exercicio02;

public class AppAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lulu", "Pitbull", 2010, "Fabiano", "(11) 98765-9876");
        
        Proprietario p = new Proprietario("Marcos","(19) 9877-9999");
        Animal animal2 = new Animal("Lessie", "Lessie", 2010, p);

        System.out.println(animal1);
        System.out.println(animal2);
    }
}
