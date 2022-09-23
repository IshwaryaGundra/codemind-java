import java.util.Scanner;
class Mab{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    k=k+1;
                }
            }
            if(k%2!=0){
                c=c+1;
            }
            else{
                c=c;
            }
        }
        System.out.println(c);
    
    }
}