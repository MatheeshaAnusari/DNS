import java.util.Arrays;

/**
 *
 * @author User
 */
public class ArraySwapper {
    static Integer[] array ={76,6,187,92,21,23,5,9,8,8143};
    static int outerIndex;

    public static void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j]= temp;
    }
    
    public static void insert(int endIndex){
        int i = endIndex;
        while(i>0 && array[i] < array[i-1]){
            swap(i, i-1);
            System.out.println("i: " + i + ", j: " + (i-1)+"," + "Array state: " + Arrays.deepToString(array));
            i --;
        }
    }
    public static void insertionSort(){
        for(outerIndex = 1;outerIndex < array.length;outerIndex++){
            insert(outerIndex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Array before sorting: "
                + Arrays.deepToString(array));
        // TODO code application logic here
        insertionSort();
        
        System.out.println("Array after sorting:"
                + Arrays.deepToString(array));
        
    }
    
}



