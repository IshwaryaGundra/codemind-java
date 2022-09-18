import java.util.Scanner;
class abs{
     static int rev(int n){
        int s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
            
        }
        return s;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=0,c=0,l=0,m=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
      int h=rev(n);
       while(h!=0){
            int r=h%10;
            l=l*10+r;
            m=m+1;
            h=h/10;
            if(m==k){
                break;
            }
       }
       
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            c=c+1;
            n=n/10;
            if(c==k){
                break;
            }
        }
        int p=rev(s);
        if((l-p)<0)
            System.out.println(-(l-p));
        else
System.out.println((l-p));
        
    }
}