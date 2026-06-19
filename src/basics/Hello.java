package basics ;
import java.util.Scanner;
public class Hello{
    public static void main (String[]args){
        System.out.println(" Hello World ! ");
        System.out.println(" wap of sum of three numbers---------------------");
        System.out.print(" enter 1st number : ");
        Scanner m = new Scanner(System.in);

        int a = m.nextInt();
        System.out.print(" enter 2nd number : ");
        int b = m.nextInt();
        System.out.print(" enter 3rd number : ");
        int c = m.nextInt();
        int sum = a+b+c;
        System.out.print(" the sum of three number is : ");
        System.out.println(sum);












    }
}