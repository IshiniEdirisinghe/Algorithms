public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {156, 98, 78, 2, 45, 19, 63, 111, 82};
        int n=array.length;
        int i=0;
        int j=0;

        //array before sorting
        System.out.print("Before sorting:   ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Sorting
        for (i = 1; i < n; i++) {
            int key = array[i];
            j=i-1;
            while (j>=0 && array[j] > key) {
                array[j + 1] = array[j];
                j=j-1;
            }
            array[j+1] = key;
        }

        //array after sorting
        System.out.print("After sorting:    ");
        for (i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
