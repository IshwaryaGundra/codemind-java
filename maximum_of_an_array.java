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
        int m=arr[0];
        for(int i=0;i<n;i++){
            if(m<arr[i]){
                 m=arr[i];
            }
        }
        System.out.println(m);
}
}