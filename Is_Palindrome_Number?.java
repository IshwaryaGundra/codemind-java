import java.util.Scanner;
class pal{
    public static void main(String args[]){
        int a,r,s=0,temp;
       
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        temp=a;
        while (a!=0)
        {
            r=a%10;
            s=s*10+r;
            a=a/10;
            
        }
        if(temp==s)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
        
    }
    
}
