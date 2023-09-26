package lec2;

public class Sort {
    public static void sort(String[] x) {
        sort(x, 0);
    }

    /** Sorts x starting from position given. */
    public static void sort(String[] x, int start) {
        if (start >= x.length) {
            return;
        }
        int smallestIndex = findSmallest(x, start);
        swap(x, smallestIndex, start);
        sort(x, start + 1);
    }

    /** Swaps x[a] and x[b] */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Gives the index of the smallest item starting from position
     *  start. For example if x = ["a", "z", "a", "c"], returns
     *  2.
     */
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
