package lec2;

import java.util.Arrays;

public class Sort {
    /** Sorts the strings in x alphabetically. */
    public static void sort(String[] x) {
        sort(x, 0);
    }

    /** Sort the strings in x alphabetically, but starting from position start. */
    public static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int smallestGreenItemIndex = findSmallest(x, start);
        swap(x, start, smallestGreenItemIndex);
        sort(x, start + 1);
    }

    /** Swaps x[a] and x[b] */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Finds the index of the smallest string starting from x[start] */
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
