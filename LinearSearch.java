import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
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

        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }

        sc.close();
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
