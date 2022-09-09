import java.util.Scanner;
class count{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,k,c=0;
        int[] arr=new int[100];
        a=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if( arr[i]%k==0)
            {
                c=c+1;
            }
        }
        
        System.out.println(c);
    }
}