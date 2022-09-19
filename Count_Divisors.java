import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System. in);
        int a=sc.nextInt();
        int c=0;
        int b=sc.nextInt();
        int k=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%k==0){
                c=c+1;
            }
        }
        System.out.println(c);
        
        
    }
}