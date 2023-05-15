import java.util.Scanner;

//A class that implements bubble sort algorithm
class BubbleSort {

    private int[] arr; // input array

    //Constructor for BubbleSort class
    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    //Method to perform bubble sort 
    public void bubbleSort() {
        int n = arr.length;

        // Loop through the array n times (where n is the length of the array)
        for (int i = 0; i < n; i++) {
            boolean swapped = false;

            // Compare adjacent elements and swap them if they are in the wrong order
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps were made in the last iteration, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

public class Main{
    //The main method of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create an object of BubbleSort class
        BubbleSort bs = new BubbleSort(arr);

        // Perform bubble sort
        bs.bubbleSort();

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}