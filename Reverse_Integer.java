import java.util.Scanner;
class Man{
    public static int rev(int n){
        int s=0;
        int temp=n;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(n>0){
            return -s;
        }
        else{
            return s;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rev(n));
    }
}