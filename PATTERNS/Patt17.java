import java.util.Scanner;

public class Patt17 {
    public static void main(String...ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt(n);
    }

    public static void Patt(int n ){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int stop = (2*(i+1))/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=stop){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
