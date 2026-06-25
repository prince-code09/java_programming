package basics;
import java.util.Scanner;
// function to print sum of two numbers ......................................
public class methods{
    public static int printMySum(int a,int b){
        int sum = a+b;// direct aise bhi kr skte hai .... return a+b; .....varaible assign jruri ni
        return sum;// return is liye use kr rahe kyuki ye hi value bahar dega
        // agr nhi use krenge toh value andar se bahar dene le liye yahi se print krwana padega direct
    }
// 2nd function to greet..........................

    public static String  greet(){
        return " hello ";
    }
// 3rd fuction/ method to print factorial..........................

    public static int factorial(int n){if (n<0){
        System.out.println(" invalid input");
    }
       int fact = 1 ;
        for (int i = n ; i>=1; i--){
            fact = i*fact ; // naya variable nhi le skte kyuki return bahar ho jayega aor wo ni janega new variable
        }
        return fact ;// loop ko br br run hone ke liye return bahar likhte h warna ek br run me hi return kr dega
    }

public static void main(String[]args){


        Scanner sc = new Scanner (System.in);
    System.out.print(" enter your 1st no. : ");
    int x = sc.nextInt();
    System.out.print(" enter your 2nd no. : ");
    int y = sc.nextInt();
    // variable namm denge toh baad me bhi use kr skte hai variable name se
//int the_sum = printMySum(x,y);
  //  System.out.print(" the sum of two number is :  "+the_sum);

    //................. yaha bhi aise kr skte hai ...........
    System.out.println(" the sum of two number is : " + printMySum(x,y));

    System.out.println(greet());

    System.out.print( "enter the number which u want factorial : ");
    int n = sc.nextInt();
    System.out.print("the factorial is:  "+factorial(n));



}}