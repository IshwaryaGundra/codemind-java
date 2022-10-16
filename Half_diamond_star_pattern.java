import java.util.Scanner;
class classnam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0;
    n=sc.nextInt();
     if(n<3 || n>100)
    {
        c+=1;
        System.out.print("The pattern is not possible");
    }
    if(c==0)
    {
    for(i=1;i<n;i++)
    {
        for(j=i;j>=1;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    for(i=1;i<=n;i++)
    {
        for(j=i;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
    }
}