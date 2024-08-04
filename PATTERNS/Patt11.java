import java.util.Scanner;

public class Patt11 {
    public static void main(String...ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt(n);
    }

    public static void Patt(int n){
        int x = 1;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                x=1;
            }
            else{
                x = 0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(x+" ");
                x=1-x;
            }
            System.out.println();
        }
    }
}
