import java.util.Scanner;
class pal{
    public static void main(String[] args){
        int c=0,r;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                c=c+1;
            }
        }
       // System.out.println(c);
        if(c==n-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}