import java.util.Scanner;
class Wave{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,k=0;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i+=2){
            if(arr[i]>arr[i+1]){
                c=c+1;
            }
        }
        for(int i=0;i<n;i+=2){
            if(arr[i]<arr[i+1]){
                k=k+1;
            }
        }
        if(k==n/2||c==n/2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}