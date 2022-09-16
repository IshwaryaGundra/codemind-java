import java.util.Scanner;
class count{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int k=sc.nextInt();
       // System.out.println(k);
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           // System.out.println(arr[i]);
        
            
            if(arr[i]%k!=0){
                c=c+1;
            }
        }
        System.out.println(c);
        
    }
}