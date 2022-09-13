import java.util.Scanner;
class Last{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[100];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int z=sc.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==z){
                c=c+1;
                
            }
            
        }
        System.out.println(c);
                
        
    }
}