import java.util.Scanner;
class Sam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++){
           if(arr[i]<a ||arr[i]>b){
               c=c+1;
              System.out.print(arr[i]+" ");
           }
        }
        if(c==0){
            System.out.print(-1);
            
        }
        
    }
}