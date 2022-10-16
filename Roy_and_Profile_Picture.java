import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a,b;
    n=sc.nextInt();
    m=sc.nextInt();
    while(m!=0)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=n && b>=n)
        {
            if(a==b)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
            m-=1;
        }
        else
        {
            System.out.println("UPLOAD ANOTHER");
        }
    }
    }
}