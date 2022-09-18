import java.util.Scanner;
class Fib{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a=0,b=1,c=1,d=0;
       if(a==0){
          // System.out.print(0+" ");
       }
        for(int i=2;i<=n;i++){
            //System.out.print(c+" ");
             c=a+b;
            a=b;
            b=c;
            if(c==n){
                System.out.println("True");
                d=1;
                break;
            }
        }
        if(d==0){
            System.out.println("False");
        }
        
    }
}