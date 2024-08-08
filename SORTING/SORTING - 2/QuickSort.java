public class QuickSort {
    public static void main(String...ar){
        int[] arr = {5,4,3,2,1};
        int low = 0;
        int high = arr.length-1;
        QS(arr, low, high);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void QS(int[] arr, int low, int high){
        if(low<high){
            int p = Partition(arr, low, high);
            QS(arr, low, p-1);
            QS(arr, p+1, high);
        }
    }

    public static int Partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                Swap(arr, j, i);
            }
        }
        Swap(arr, i+1, high);
        return i+1;
    }

    public static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
