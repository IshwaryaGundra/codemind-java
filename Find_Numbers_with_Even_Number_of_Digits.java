import java.util.Scanner;
import java.lang.Math;
class Mab{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,d;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
          d=(int)Math.log10(arr[i])+1;
          if(d%2==0){
              c=c+1;
          }
        }
        System.out.println(c);
    }
        
}