package basics;
import java.util.Scanner;
public class pattern{
    public static void main(String[]args){
        //...........................................space print me ("  ")same width rakho pattern printing me
        // .. .........warna alignment hil/bigad  jaati h
    // right triangle me row == column {compulsary}  col depend on row

//...............................................solid pattern
//      for(int i=1;i<=4;i++){
//          for (int j=1;j<=4;j++){
//              System.out.print("* ");
//          }
//          System.out.println();
//      }



        //...................................triangle pattern
//      for (int row=1;i<=5;row++){
//          for(int col=1;j<=row;col++){
//              System.out.print("* ");
//          }
//          System.out.println();
//      }



        //...............................................rhombus pattern
//        int n = 5 ;
//        for(int row =1;row<=n;row++ ) {
//            for (int col = 1; col <= n - row; col++)
//                System.out.print("-   ");
//
//            for (int j = 1; j <= n; j++)
//                    System.out.print("* ");
//            System.out.println();
//            }



        //.......................................................invert triangle
//
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=row;col<=n;col++){
//                System.out.print((char)('A'+row+col-2)+" ");
//            }
//            System.out.println();
//        }



        //......................................................mountain pattern
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//                int j=9;
//            for(int m =1; m<=2*row-1;m=m+1){
//                System.out.print("* ");
//            }
//            System.out.println();
  //  }


    //............................................reverse mountain
//        int n=10;
//        for(int row =1;row<=n;row++){
//            for(int col=1;col<=row-1;col++){
//                System.out.print("  ");
//            }
//            for (int m=1;m<=(2*n+2)-(2*row+1);m++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//......................................................hollow rectange pattern
//        int n=4;
//        int p=6;
//        for(int row=1;row<=n;row++){
//        for(int col=1;col<=p;col++) {
//        if (row==1 || row==n || col==1 || col==p){
//            System.out.print("* ");
//        }
//        else{
//            System.out.print("  ");   // har column ki width same rakhni padti h is liye 2 space
//        }
//        }
//        System.out.println();
//    }


  //......................................................hollow roght angle triangle pattern

//        int n =5;   // row
//        for(int row=1;row<=n;row++) {
//            for (int col = 1; col <= row; col++) {
//                if (col== 1 ||  row == n ||row ==col) {
//                    System.out.print("* ");         }
//                else{
//                    System.out.print("  ");
//                }      }
//            System.out.println();
//            }

  //..................................................... cross pattern
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n;col++){
//                if(row==col||row+col==n+1){
//                    System.out.print("x ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }









        }}