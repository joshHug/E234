package lec2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog maya = new Dog(100);
        Dog lildog = new Dog(5);

        System.out.println(Dog.binomen);
        Dog.binomen = "potato";
        System.out.println(Dog.binomen);
    }
}
