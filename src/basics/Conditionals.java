package basics;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[]args){
//        ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,concept of conditionals ( if else if ladder )

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


        // ..........................................................conditionals practice (switch case )
        // break optional agr nhi lagaoge toh sb run ho jayega and also default also optional
        // ek line me bhi likh skte h but neat and clean ke liye aise likho

        Scanner scc = new Scanner(System.in);
        System.out.print(" enter your number(1-7) to find day : ");
        int day = scc.nextInt();
        switch(day) {
            case 1 :
                System.out.println(" today is monday ");
                break;
            case 2 :
                System.out.println(" today is tuesday ");
                break;
            case 3 :
                System.out.println(" today is wednesday ");
                break;
            case 4 :
                System.out.println(" today is thursday ");
                break;
            case 5 :
                System.out.println(" today is friday ");
                break;
            case 6 :
                System.out.println(" today is saturday ");
                break;
            case 7 :
                System.out.println(" today is sunday ");
                break;
            default:
                System.out.println(" invalid ");

        }



// ........................................................conditionals practice (enhance switch case )
// mostly prefer break ki jarurat nhi padti and default is optonal

        Scanner scm = new Scanner(System.in);
        System.out.print(" enter your month day from (1-12) : ");
        int month = scm.nextInt();
        switch (month) {
            case 1 ->
                    System.out.println(" this month is jan ");
            case 2 ->
                    System.out.println(" this month is feb ");
            case 3 ->
                    System.out.println(" this month is march ");
            case 4 ->
                    System.out.println(" this month is april ");

            case 5 -> System.out.println(" this month is may ");
            case 6 -> System.out.println(" this month is june ");
            case 7 -> System.out.println(" this month is july");
            case 8 -> System.out.println(" this month is aug ");
            case 9 -> System.out.println(" this month is sep ");
            case 10 -> System.out.println(" this month is oct ");
            case 11 -> System.out.println(" this month is nov");
            case 12 -> System.out.println(" this month is dec ");
            default -> System.out.println(" invalid");
        }


// .................................................conditionals using ( ternary operator )
        // ek shortcut h if else wle statement ko likhne ka ek line me

        Scanner sca = new Scanner (System.in);
        System.out.print(" enter your age : ");
        int agee = sca.nextInt();

        System.out.print(" do you have license (true / false)  : ");
        boolean has_license = sca.nextBoolean();

        String result = ( agee>= 18 && has_license) ? " you can drive " : " you can not drive ";
        System.out.println(result );




    }}