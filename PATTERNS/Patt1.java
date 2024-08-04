import java.util.Scanner;

public class Patt1 {
    public static void main(String...ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt(n);
    }

    public static void Patt(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
