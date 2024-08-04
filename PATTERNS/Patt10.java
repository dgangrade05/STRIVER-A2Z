import java.util.Scanner;

public class Patt10 {
    public static void main(String...ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tri(n);
        InvertedTri(n);
    }

    public static void Tri(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void InvertedTri(int n){
        for(int i=1;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
