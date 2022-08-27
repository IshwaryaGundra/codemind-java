import java.util.Scanner;
class avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        float avg=(float)(a+b)/2;
        System.out.println(""+String.format("%.4f",avg));
    }
}