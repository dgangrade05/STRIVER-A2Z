public class RecursiveBubbleSort {
    public static void main(String...ar){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        BubbleSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void BubbleSort(int[] arr, int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    Swap(arr, j, j-1);
                }
            }
        }
        BubbleSort(arr, n-1);
    }

    public static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
