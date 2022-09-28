import java.util.Scanner;
import java.lang.Math;
class Man{
    public static boolean ps(int n){
        double sq=Math.sqrt(n);
        if(sq*sq==(int)sq*sq){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int s=0;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j])
                {
                    c=c+1;
                }
            }
            System.out.print(c+" ");
        }
    }
}