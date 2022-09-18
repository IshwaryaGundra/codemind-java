import java.util.Scanner;
class Fib{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a=0,b=1,c=1;
       if(a==0){
           System.out.print(0+" ");
       }
        for(int i=2;i<=n;i++){
            System.out.print(c+" ");
             c=a+b;
            a=b;
            b=c;
            
        }
        
    }
}