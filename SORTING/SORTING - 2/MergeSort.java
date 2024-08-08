public class MergeSort {
    public static void main(String...ar){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        Sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Sort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            right[i-mid]=arr[i];
        }
        Sort(left);
        Sort(right);
        Merge(arr, left, right);
    }

    public static void Merge(int[] arr, int[] left, int[] right){
        int i=0, j=0,k=0;
        while(i< left.length && j< right.length){
            if(left[i]<=right[i]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i< left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j< right.length){
            arr[k]=right[j];
            k++;
            j++;
        }
    }
}
