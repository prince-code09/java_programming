package basics;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[]args){
//        ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,concept of conditionals
        System.out.println("concept of conditionals  \n");
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter your age : ");
        int age = sc.nextInt();
        if (age>56) {
            System.out.println("you are very experienced  ");
        }
        else if (age >40){
            System.out.println(" you are less experienced ");

        }
        else if (age>30){
            System.out.println(" try hard you can do it ");
        }

        else {
            System.out.println(" ok ok ");
        }













    }
}
