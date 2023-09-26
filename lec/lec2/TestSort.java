package lec2;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class TestSort {
    @Test
    public void testSort() {
        String[] x = {"i", "have", "an", "egg"};
        String[] expectedOutput = {"an", "egg", "have", "i"};
        Sort.sort(x);

        assertThat(x).isEqualTo(expectedOutput);
    }

    @Test
    public void testSwap() {
        String[] x = {"i", "have", "an", "egg"};
        Sort.swap(x, 1, 3);

        String[] expectedResult = {"i", "egg", "an", "have"};
        assertThat(x).isEqualTo(expectedResult);
    }

    @Test
    public void testFindSmallest() {
        String[] x = {"i", "have", "an", "egg"};
        int smallestIndex = Sort.findSmallest(x, 1);
        int expectedresult = 2;

        assertThat(smallestIndex).isEqualTo(expectedresult);

        smallestIndex = Sort.findSmallest(x, 3);
        expectedresult = 3;
        assertThat(smallestIndex).isEqualTo(expectedresult);
    }
}
