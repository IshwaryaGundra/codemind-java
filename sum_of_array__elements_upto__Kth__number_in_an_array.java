import java.util.Scanner;
class Sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int a=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int j=0;j<arr[k-1];j++)
        {
            c=c+arr[j];
            //System.out.println(arr[j]);
        }
        
        System.out.println(c);
    }
}