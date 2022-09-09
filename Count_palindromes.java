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
        for(int i=0;i<n;i++)
        {
            int s=0;
            int temp=arr[i];
           while(arr[i]!=0)
           {
               r=arr[i]%10;
               s=s*10+r;
               arr[i]=arr[i]/10;
           }
           if(temp==s)
           {
               c=c+1;
           }
        }
        System.out.println(c);
    }
}