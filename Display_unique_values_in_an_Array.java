import java.util.Scanner;
class Mab{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c,d=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.print(arr[i]+" ");
                 d=1;
            }
        }
        if(d==0){
            System.out.println("-1");
        }
    }
}