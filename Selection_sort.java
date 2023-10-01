public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with the first element in the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        
        selectionSort(arr);

        System.out.println("\nSorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
