package practices;

import java.util.Scanner;

public class prblm_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        System.out.println("the factorial of "+num+" is "+factoril(num));
    }
    public static int factoril(int x){
        if (x==1 || x==0){
            return 1;
        }
        return x*factoril(x-1);
    }
}
