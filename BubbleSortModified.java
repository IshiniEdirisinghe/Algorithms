public class BubbleSortModified {
    public static void main(String[] args) {
        int[] array={78, 98, 33, 2, 45, 19, 63, 48};
        int n=array.length;
        int i=0;
        int j=0;

        // Printing the array before sorting
        System.out.print("Before sorting:   ");
        for (i=0; i<n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    
        // checking if the array is already sorted
        for (i=0; i<n; i++) {
            if(array[i]<array[i+1]){
                // Sorting
                for (i=0; i<n-1; i++) {
                    for (j=0; j<n-i-1; j++) {
                        if (array[j] > array[j+1]) {
                            int next = array[j];
                            array[j] = array[j+1];
                            array[j+1] = next;
                        }
                    }
                }
                // Printing the array after sorting
                System.out.print("After sorting:    ");
                for (i=0; i<n; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println(); 
            }
            else {
                // Printing the array after sorting
                System.out.print("After sorting:    ");
                for (i=0; i<n; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }
    }     
}               
        

    
