import java.util.Scanner;
import java.lang.Math;
class Per{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(Math.sqrt(n)==(int)Math.sqrt(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}