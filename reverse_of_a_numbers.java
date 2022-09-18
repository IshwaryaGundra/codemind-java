import java.util.Scanner;
class Rev{
    public static void main(String args[]){
        int s=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
          int   r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println(s);
        
    }
}