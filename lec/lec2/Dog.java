package lec2;

public class Dog {
    public int size;
    public static String binomen = "Canis familiaris";

    public Dog(int s) {
        /** The recipe for creating dogs. */
        /** This is known as a constructor. */
        size = s;
    }

    public void makeNoise() {
        if (size < 10) {
            System.out.println("yipyipyip!");
        } else if (size < 30) {
            System.out.println("Bark");
        } else {
            System.out.println("WOOF");
        }
    }

    public static Dog maxDog(Dog a, Dog b) {
        if (a.size > b.size) {
            return a;
        }
        return b;
    }
}
