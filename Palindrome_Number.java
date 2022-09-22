import java.util.Scanner;
class Man{
    public static boolean pal(int n){
        int s=0;
        int temp=n;
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
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(pal(k)==true){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}