package lec2;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class TestDog {
    @Test
    public void testMaxDog() {
        Dog lilDog = new Dog(5);
        Dog largeDog = new Dog(100);

        Dog result = Dog.maxDog(lilDog, largeDog);
        assertThat(result).isEqualTo(largeDog);
    }
}
