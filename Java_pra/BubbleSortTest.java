public class BubbleSortTest {
    public static void main(String[] args) {
       
        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

        
        System.out.print("Array before sorting: ");
        printArray(numbers);

       
        BubbleSort.bubbleSort(numbers);

        
        System.out.print("Array after sorting: ");
        printArray(numbers);
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
