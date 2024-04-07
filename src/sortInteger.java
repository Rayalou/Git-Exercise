
public class sortInteger {

	 public static void main(String[] args) {
	        int[] intArray = {6, 4, 9, 2, 3, 7, 5};
	        
	        System.out.println("Original Integer Array:");
	        printIntArray(intArray);
	        
	        bubbleSort(intArray);
	        
	        System.out.println("\nSorted Integer Array:");
	        printIntArray(intArray);
	    }
	    
	    // Bubble Sort Algorithm for integers
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (arr[j] > arr[j+1]) {
	                    // swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	    }
	    
	    // Utility method to print integer array
	    public static void printIntArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}
