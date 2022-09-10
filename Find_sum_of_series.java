import java.util.Scanner;
class Sam{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float s=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+(1.0/i);
        }
        System.out.format("%.2f",s);
    }
}