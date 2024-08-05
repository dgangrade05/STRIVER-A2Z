import java.util.Arrays;

public class BubbleSort {
    public static void main(String...ar){
        int[] arr = {15, 42, 3, 67, 29, 10, 84, 23, 58, 72, 35, 49, 91, 16, 54, 7, 66, 88, 12, 37, 44, 5, 83, 28, 61, 70, 19};
        System.out.println(Arrays.toString(BS(arr)));
    }

    public static int[] BS(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
