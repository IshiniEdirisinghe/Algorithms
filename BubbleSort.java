public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {78, 98, 33, 2, 45, 19, 63, 48};
        int i=0;
        int j=0;
        int n=array.length;

        //printing the array brfore sorting
        System.out.print("Bfore sorting:    ");
        for (i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //sorting
        for (i=0; i<n-1; i++) {
            for (j=0; j<n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int next = array[j];
                    array[j] = array[j+1];
                    array[j+1] = next;
                }
            }
        }
        
        //printing the array after sorting
        System.out.print("After sorting:    ");
        for (i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }


}
