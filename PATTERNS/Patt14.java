import java.util.Scanner;

public class Patt14 {
    public static void main(String...ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt(n);
    }

    public static void Patt(int n){
        for(int i=0;i<n;i++){
            for(char  ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
