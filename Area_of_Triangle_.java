import java.util.Scanner;
import java.lang.Math;
class triangle{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float s ,A;
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
         s=(float)(a+b+c)/2;
        A=s*(s-a)*(s-b)*(s-c);
        System.out.println(""+String.format("%.2f",Math.sqrt(A)));
    }
}