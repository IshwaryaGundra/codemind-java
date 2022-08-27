import java.util.Scanner;
import java.lang.Math;
class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        float s,A;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        A=s*(s-a)*(s-b)*(s-c);
        System.out.println(""+String.format("%.2f",Math.sqrt(A)));
    }
}