public class RecursiveInsertionSort {
    public static void main(String...ar){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        InsertionSort(arr, 0, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void InsertionSort(int[] arr, int i, int n){
        if(i==n){
            return;
        }
        int j = i;
        while( j>0 && arr[j-1]>arr[j]){
            Swap(arr,j, j-1);
            j--;
        }
        InsertionSort(arr, i+1, n);
    }

    public static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
