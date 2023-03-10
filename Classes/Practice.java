package Classes;

public class Practice {
    public static void main(String[] args) {

        Dog peace = new Dog();

        Dog glory = new Dog("pit null", "brown and white", 500.00, 100);

        System.out.println(peace.getBreed());

        System.out.println(glory.getBreed());

        peace.setBreed("sausage");
        peace.setAge(13);
        peace.setColor("brown");
        peace.setWeight(999.99);

        System.out.println(peace.getBreed());
        System.out.println(glory.getBreed());
    }
}
