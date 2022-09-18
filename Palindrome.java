import java.util.Scanner;
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

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(ispal(n)==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}