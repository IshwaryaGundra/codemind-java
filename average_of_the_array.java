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
        float avg=(float)s/n;
        System.out.format("%.2f",avg);
        
}
}