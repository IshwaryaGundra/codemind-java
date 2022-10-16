import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,sum=0,temp;
    n=sc.nextInt();
    temp=n;
    while(n!=0)
    {
        int i=1,k=1;
        d=n%10;
       while(i<=d)
        {
            k=k*i;
            i++;
        }
        sum=sum+k;
        n=n/10;
    }
    if(sum==temp)
    {
        System.out.println("The number "+temp+" is a strong number");
    }
    else
    {
        System.out.println("The number "+temp+ " is not a strong number");
    }
    }
}