public class sortString {
    public static void main(String[] args) {
        String[] stringArray = {"Mazda", "Acura", "Ford", "Honda", "Toyota", "Hyundai"};
        
        System.out.println("Original String Array:");
        printStringArray(stringArray);
        
        bubbleSort(stringArray);
        
        System.out.println("\nSorted String Array:");
        printStringArray(stringArray);
    }
    
    // Bubble Sort Algorithm for strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    // swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    // Utility method to print string array
    public static void printStringArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
        
        // This is the end of the source code 
    }
}
