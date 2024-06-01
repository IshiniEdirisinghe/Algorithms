package SortingAlgorothms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {67, 89, 30, 1, 554, 72, 105};
	        int n = array.length;

	        //array before sorting
	        System.out.print("Before sorting: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();

	        // Sorting
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = array[minIndex];
	            array[minIndex] = array[i];
	            array[i] = temp;
	        }

	        // array after sorting
	        System.out.print("After sorting:  ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	}

}
