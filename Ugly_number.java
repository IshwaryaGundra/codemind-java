import java.util.Scanner;
class ugl{
    public static int maxd(int a, int b){
    while (a % b == 0)
        a=a/b;
    return a;
        
    }
    public static boolean isugnum(int n){
      n=maxd(n, 2);
    n=maxd(n, 3);
    n=maxd(n, 5);
    if(n == 1){
        return true;
    }
    else{
        return false;
    }
        
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isugnum(n)==true){
    System.out.println("Ugly Number");
    }
    else{
        System.out.println("Not Ugly Number");
        
    }
    }
}