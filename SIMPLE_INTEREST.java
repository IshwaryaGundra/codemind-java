import java.util.Scanner;
class Sim{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(p*t*r/100);
    }
}