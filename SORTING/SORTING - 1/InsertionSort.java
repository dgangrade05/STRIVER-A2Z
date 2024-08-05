import java.util.Arrays;

public class InsertionSort {
    public static void main(String...ar){
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(IS(arr)));
    }

    public static int[] IS(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}
