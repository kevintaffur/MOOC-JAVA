import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int number : arr) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] arr) {
        int smallest = MainProgram.smallest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int smallest = arr[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void sort(int[] arr) {
        int startIndex = 0;
        while (startIndex < arr.length - 1) {
            int index = MainProgram.indexOfSmallestFrom(arr, startIndex);
            if (index != startIndex) {
                MainProgram.swap(arr, startIndex, index);
                System.out.println(Arrays.toString(arr));
            } else {
                System.out.println(Arrays.toString(arr));
            }
            startIndex++;
        }
    }
}
