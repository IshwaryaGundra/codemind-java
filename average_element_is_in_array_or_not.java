import java.util.Scanner;
class Avg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int s=0,c=0;
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            s=s+arr[i];
        }
        int avg=(int)s/n;
        for(int i=0;i<n;i++){
            if(arr[i]==avg){
                c=c+1;
            }
        }
        if(c>=1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}