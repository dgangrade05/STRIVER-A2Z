import java.util.Scanner;

public class Patt21 {
    public static void main(String...ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt(n);
    }

    public static void Patt(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
