import java.util.Scanner;
class Sam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p;
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int c=0;
            int l=sc.nextInt();
            int r=sc.nextInt();
            for(int j=l;j<=r;j++)
            {
                p=j%10;
                if(p==2 || p==3 || p==9)
                {
                    c=c+1;
                }
            }
             System.out.println(c);
        }
       
    }
}