package lec2;


import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;

public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 0);
        assertThat(actual).isEqualTo(expected);

        expected = 3;
        actual = Sort.findSmallest(input, 3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSwap() {
        String[] input = {"some", "people", "eat", "apricots"};
        String[] expected = {"eat", "people", "some", "apricots"};
        Sort.swap(input, 0, 2);
        assertThat(input).isEqualTo(expected);
    }

}
