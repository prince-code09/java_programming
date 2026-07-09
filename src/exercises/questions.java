package exercises;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class questions{
    public static void main(String[]args){

  //(1)  ..........................Print all numbers from 1 to 10 using a loop
//        Scanner sc =new Scanner (System.in);
//        System.out.print(" enter the number where u want to print : ");
//        int ten = sc.nextInt();
//        int i=1;
//        while(i<=ten){
//            System.out.println(i);
//            i++;
//        }

//     2   ...................... Print numbers from 10 down to 1 in reverse order.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your number : ");
//        int num = sc.nextInt();
//        int i =num ;
//        while (i>=1){
//            System.out.println(i);
//            i--;
//        }
//    3    ..............................Print all even numbers between 1 and 100.

//        int i=1;
//        while(i<=100){
//            if (i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }

//  4 .................................... Print all odd numbers between 1 and 100
//        int i=1;
//        while(i<=100){
//            if (i%2!=0)
//                System.out.println(i);
//            i++;
//     }

   //     5. Print the multiplication table of a given number from n × 1 to n × 10.

//        Scanner sc = new Scanner(System.in);
//        System.out.print(" enter the table's no. : ");
//        int table=sc.nextInt();
//        int i = 1 ;
//        while (i<=10){
//            System.out.println(table*i);
//            i++;
 //       }

 //     6. Calculate and print the sum of the first n natural numbers.

//        Scanner sc = new Scanner(System.in);
//        System.out.print(" enter the no. : ");
//        int n= sc.nextInt();
//       int i=1;
//       int add =0;
//        while (i<=n){
//            add+=i;
//            i++;
//        }
//        System.out.println(add);


//....7...... Calculate the sum of all even numbers from 1 up to n.

//        Scanner sc = new Scanner (System.in);
//        System.out.print(" enter the no. which u wnat sum of even no. : ");
//        int num =sc.nextInt();
//
//        int i=1;
//        int add =0;
//        while(i<=num)
//            if (i%2==0)
//                add = add + i;
//            i++;
//        System.out.println(add);


//      8. ...Calculate the sum of all odd numbers from 1 up to n


//        Scanner sc = new Scanner (System.in);
//        System.out.println(" enter your no. : ");
//        int n =sc.nextInt();
//        int i = 1 ;
//        int add =0;
//        while(i<=n){
//            if (i%2!=0)
//                add=add+i;
//                i++;
//        }
//        System.out.println(add);


 //....       9. Calculate and print the factorial of a given number.

//        Scanner sc = new Scanner(System.in);
//        System.out.println(" enter your number : ");
//        int n =sc.nextInt();
//
//        int i =n;
//        int fact=1;
//        while(i>=1){
//            fact=fact*i;
//            i--;
//        }
//        System.out.println(fact);


 //   10... . Find and print the product of all digits of a given number


//        Scanner sc = new Scanner (System.in);
//        System.out.println(" enter your number");
//        int n =sc.nextInt();    // int n = 523
//        int product = 1 ;
//                                   //      int i = 1 ; DIRECT KR SKTE H YE LIKHNA JARURI NHI
//        while(0<n){
//            int digit = n%10;    //ek value milegi jo hme store krna h iske liye naya variable bnaya
//            product=product*digit ;
//            n=n/10;   //or n/=10
//        }
  //      System.out.println(product);
//------------------------------------------------------------------------------------------
//        int product=1;
//        for(int n=223;0<n;n=n/10){
//            int form=n%10;
//            product*=form;
//        }
//        System.out.println(product);


//        11.......... Count and print the total number of digits in a given number

//        Scanner sc = new Scanner (System.in);
//        System.out.println(" enter your no. : ");
//        int n =sc.nextInt();
//                                 //  int n = 01001;( 456;)      // o se strt kroge isi me toh o ko binary le lega and result ek kam show krega
//                                 // int i = 1;
//        int sum = 0;
//        while (0<n){
//             n = n/10;
//            sum+=1;
//        }
//        System.out.println(sum);


//        12.......... Reverse the given number and print the reversed value.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your number : ");
//        int num = sc.nextInt();   // int n =456
//         int sum= 0;
//         while(0<num){
//           int new1 = num%10;            // num=num/10 bhi kr skte hai
//           sum= sum*10+new1;            // reverse ke liye ye formula lagta hai
//           num/=10;
//         }
//        System.out.println(sum);


 //       13. .....Check whether the given number is a palindrome


//        Scanner sc = new Scanner (System.in);
//        System.out.print(" enter your value to check palindrome : ");
//        int n=sc.nextInt();                        // int n =121  ==121
//        int ans =0;
//        int original=n;               // bahar variable bnaya kyuki n me divide wali value store hojati h
//            while (0 < n) {
//                int form = n % 10;
//                ans = ans * 10 + form;
//                n /= 10;
//            }
//        if (ans ==original){
//            System.out.println(" yes it is pallindrome");
//        }
//        else{
//            System.out.println(" no your entered no. = " +original+ " is not pallindrome");
//        }

   //     14........... Find and print the sum of digits of the given number.


//        int n = 7457;
//        int sum=0;
//        while(0<n){
//            int form= n%10;
//            sum+=form;
//            n/=10;
//        }
//        System.out.println(sum);


    //    15........... Check whether the given number is an Armstrong number

   // armstrong mtlb hota h given value me jitni digit ho utni digit ka value me square
        // cube.. and plus then total is equal to that value

//        int n =756;                 //153
//        int add=0;
//        int comp=n;
//        while(0<n){
//            int form=n%10;
//            add+=form*form*form;
//            n/=10;
//        }
//        if (comp==add){
//            System.out.println("yes it is armstrong");
//        }
//        else{
//            System.out.println(" no it is not a armstrong");
//        }

   //     16........... Check whether the given number is a Perfect number.
//
//       int n=33550336;   // perfect no. wo no. hote h jinke factors ka sum unhi ke equal aaye & wo no. khud na involve ho factor me
//       int add =0;   // some perfect no. are ---6,28,496,8128,33550336
//       int i =1;
//       while(n>i){
//           if(n%i==0){
//               add+=i;
//           }
//           i++;
//       }
//        if (add==n){
//            System.out.println(" yes your entered no. is perfect number ");
//        }
//        else {
//            System.out.println(" no it is not perfect square ");
//        }


   //     17.......... Print all prime numbers between 1 and 100.
        // prime no. wo no. jiske sirf 2 hi factor hote h ek wo khud aor 1.



     //   19. ......................Print the Fibonacci series up to n terms.

//        int a = 0;
//        int b =1;
//        int i =1;
//        System.out.print(a+" "+b+" ");
//        while(i<=50){
//        int total=a+b;
//        a=b;
//        b=total;
//            i++;
//            System.out.print(total+" ");  yaha likha h is liye ek term print then loop then print then loop
//        }

  // 20........... Find and print the sum of the Fibonacci series up to n terms.

//        int n=6;
//        int a=0;
//        int b=1;
//        System.out.print(a+" "+b+" ");
//        int finall =a+b;                 //               int finall=0;
//        int i=1;
//        while(i<=n-2){
//           int add =a+b;
//            a=b;
//            b=add;
//            System.out.print(add+" ");      // loop br br idhr se jara toh yaha line change br br hogi thats'y.
//            finall+=add;
//            i++;
//        }
//        System.out.println("\n your answer is : "+finall);


    //    21........... Print the square of each number from 1 to n.

//        int n=5;
//        int i=1;
//        while(i<=5){
//        System.out.println(i*i);
//        i++;
//        }


   //     22................ Print the cube of each number from 1 to n
//
//        int n=5;
//        int i=1;
//        while(i<=5){
//        System.out.println(i*i*i);
//        i++;
//        }

     //..........   23. Print all numbers between a and b that are divisible by 7


//        int b=35;
//        int a=7;
//        a++;              // a ko include nhi krega ye
//        while(a<b){
//            if(a%7==0){
//                System.out.println(a);
//            }
//            a++;
//        }


   //     24............... Print all factors of the given number.

//        int n =28;
//        int i=1;
//        while(i<=n){
//           if(n%i==0){
//               System.out.println(i);
//           }
//           i++;
//        }


     //   25................. Find and print the sum of all factors of the given number

//        int n=28;  int i=1;  int ans=0;
//        while(i<=n){
//            if(n%i==0)
//                ans+=i;
//            i++;
//        }
//        System.out.println(ans);


 //       26...... Find the HCF (Highest Common Factor) of two given numbers.

//        int n1=28;  // used se input loge toh kaun sa chhota kaun sa bada pata nhi toh
//        int n2=32;   // if else use kro naya variable bana ke
//        int i=1;   // initialization 1 se krenge is tarah me variable exception aayega
//        int result=0;
//        while(i<=n1){
//            if(n1%i==0 && n2%i==0)
//                result=i;           //   hr br naya result rakhna h toh bs simple sa = to krdo
//            i++;
//        }
//        System.out.println(result);


  //       27........... Find the LCM (Least Common Multiple) of two given numbers.
//        int i;
//        int n1=32;    // lcm me multiples hote h toh wo aage jata hai tbhi apne hi no. se divide hota hai
//        int n2= 42;
//        int result=0;
//        if(n1>n2){                 // ab user koi bhi input de chahe pahle bada ya chhota
//            i=n1;  }
//        else{
//            i=n2; }
//        while( true){                    //  (i<=n1*n2)
//            if(i%n1==0 && i%n2==0){
//                result=i;
//                break;}
//                i++;
//        }
//        System.out.println(result);


    //    28.    .................   Find the smallest digit in the given number.










}}