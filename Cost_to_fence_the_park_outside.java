import java.util.Scanner;
class Avg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  l= sc.nextInt();
        int  b= sc.nextInt();
        int  w= sc.nextInt();
        int  c= sc.nextInt();
        int a=2*w*(l+b+2*w);
        System.out.println(a*c);
        
       
    }
}