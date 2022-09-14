import java.util.Scanner;
class Sam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,s=0;
        float avg;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++){
           // System.out.print(arr[i]+" ");
           c=c+arr[i];
        }
        avg=c/n;
        for(int i=0;i<n;i++){
            if(arr[i]<=avg){
                s=s+1;
            }
        }
        System.out.println(s);
        
    }
}