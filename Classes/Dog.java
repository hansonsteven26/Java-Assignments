package Classes;

public class Dog {

    private String breed, color;
    private Double weight;
    private Integer age;

    public Dog() { // this is so useful it's crazy
    } // this is a blank constructor. it initializes nothing, but it creates an object
      // and makes all variables default value

    public Dog(String breed, String color, Double weight, Integer age) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof Woof");
    }

    public void sleep() {
        System.out.println("Snore Snore");
    }

    public void eat() {
        System.out.println("Chomp Chomp");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", color=" + color + ", weight=" + weight + ", age=" + age + "]";
    }
}
