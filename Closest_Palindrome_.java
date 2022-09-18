import java.util.Scanner;
import java.lang.Math;
class pal{
    public static boolean ispal(int n){
        int temp=n,s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
            
        }
        if(s==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void  clospal(int n){
        int lp=n-1;
        while(ispal(lp)==false){
            lp=lp-1;
        }
        int sp=n+1;
        while(ispal(sp)==false){
            sp=sp+1;
        }
        if(Math.abs(n-lp)==Math.abs(n-sp)){
            System.out.print(lp+" "+sp);
           // System.out.print(sp);
        }
       else  if (Math.abs(n-lp)<Math.abs(n-sp)){
            System.out.println(lp);
        }
        else
        System.out.println(sp);
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        clospal(n);
        
    }
}