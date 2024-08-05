import java.util.Arrays;

public class SelectionSort {
    public static void main(String... ar) {
        int[] arr = {15, 42, 3, 67, 29, 10, 84, 23, 58, 72, 35, 49, 91, 16, 54, 7, 66, 88, 12, 37, 44, 5, 83, 28, 61, 70, 19};
        System.out.println(Arrays.toString(SS(arr)));
    }

    public static int[] SS(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxIndex(arr, 0, last);
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }

    public static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
