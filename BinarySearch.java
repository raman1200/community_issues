import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int key){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(key == array[mid]){
                return mid;
            }
            if(key < array[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }

        sc.close();
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)