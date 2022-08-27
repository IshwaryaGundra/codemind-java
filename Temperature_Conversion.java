import java.util.Scanner;
class temp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=(float)(32+(c*9.0/5));
        System.out.println(""+String.format("%.2f",f));
        
    }
}