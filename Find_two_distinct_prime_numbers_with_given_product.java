import java.util.Scanner;
class Prim{
    public static boolean prime(int n){
        if(n==1){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                //int k,m;
                if(prime(i)==true){
                  i=i;
                }
                if(prime(j)==true){
                   j=j;
                }
                if(i*j==n){
                    c=c+1;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
        if(c==0){
              System.out.print("-1");
            
        }
    }
}