import java.util.Scanner;
import java.lang.Math;
class Sq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n =sc.nextInt();
            double sr=Math.sqrt(n);
            
            if((int)sr*sr==n)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}