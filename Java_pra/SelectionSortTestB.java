import java.util.Arrays;

public class SelectionSortTestB {
    Integer[] a;

    // Constructor
    public SelectionSortTestB(Integer[] a) {
        this.a = a;
    }

    // Selection sort method
    public void selectionSort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max_idx]) {
                    max_idx = j;
                }
                System.out.println(
                    "i = " + i +
                    "; j = " + j +
                    "; max_idx = " + max_idx +
                    "; cur_max = " + a[max_idx] +
                    "; " + Arrays.deepToString(a)
                );
            }
            swap(i, max_idx);
        }
    }

    // Swap method to exchange elements
    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Main method
    public static void main(String[] args) {
        Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
        System.out.println("Initial Array: " + Arrays.deepToString(array));

        SelectionSortTestB sorter = new SelectionSortTestB(array);
        sorter.selectionSort();

        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}