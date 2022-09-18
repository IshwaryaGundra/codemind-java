import java.util.Scanner;
import java.lang.Math;
class Dis{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int temp=n;
        int l=n;
        while(n>0){
            int r=n%10;
            c=c+1;
            n=n/10;
        }
        double s=0;
        while(temp!=0){
            int p=temp%10;
            s=s+Math.pow(p,c);
            temp=temp/10;
            c=c-1;
        }
        if(l==(int)s){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}