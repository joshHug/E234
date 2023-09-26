package lec2;

import static com.google.common.truth.Truth.assertThat;

public class TestDog {
    public static void testMaxDog() {
        Dog a = new Dog(10);
        Dog b = new Dog(100);
        Dog larger = Dog.maxDog(a, b);

        assertThat(larger).isEqualTo(b);
    }

    public static void main(String[] args) {
        testMaxDog();
    }
}
