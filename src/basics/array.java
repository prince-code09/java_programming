package basics;
import java.util.Scanner;
public class array {
    static void main(String[]args) {
    //    ***********************************************************************1d array



//      int marks[]= {1,2,3};              // ...................value malum h toh direct de skte h
//        System.out.println(marks[0]);
//        for(int i =0; i<=2; i++ ){
//            System.out.println(marks[i]);
//        }



        //....................................................2nd method to make array

//         int arr[]= new int[4];    //................aise bhi krke check ke liye dekh skte hai
//        System.out.println(arr[3]); //  variable bana dete h toh variable me space cover kr leta hai {int ke liye 0} se and {boolean ke liye false} se
//        arr[1]=10;
//        arr[2]=16;
//        arr[3]=13;
//        System.out.println(arr[3]);



//..........................................................basics

        //  int []aree={1,2,3,411,3,16,17};
        //  System.out.println(aree[3]);   // apne se index deke print krwnaa.
        // for(int i =0; i<aree.length;i++){
        //   System.out.println(aree[i]);
        //  }
//        Scanner sc = new Scanner(System.in);
//        int []marks=new int[6];
//        for (int i =0; i<marks.length; i++){
//            System.out.print("enter your value for index "+(i)+ " :  ");
//            marks[i] = sc.nextInt();                    // taking input from user
//        }
//        for(int i=0;i<marks.length;i++){
//            System.out.println("the value of index "+i+" is : "+marks[i]);
//        }


        //  ...................................array element total sum and print them;
//        int val=1;
//        int arr[]= {1,2,3,4,5};
//        for(int i=0;i<arr.length;i++){
//            val*=arr[i];  // val=val*arr[i]
//        }
//        System.out.println(val);


//................................................find maximum ya biggest element in an array
//        int [] array={644,22,444,33,55};
//        int ans=array[0];           // taki index 0 wali value update hoti rahe
//        for(int i=0;i<array.length;i++){
//            if(array[i]>ans)
//                ans = array[i];
//        }
//        System.out.println(ans);


//................................................find minimum ya smallest element in an array
//    int array[]={22,33,222,666,2};
//    int result=array[0];
//    for(int i=0;i<array.length;i++){
//        if (array[i]<result)
//            result=array[i];
//    }
//        System.out.println(result);


        //     ............................................user se input leke total sum nikalne ke liye array ke andar
   //     Scanner sc = new Scanner (System.in);
   //     System.out.print(" enter your size of array  : ");
  //      int val = sc.nextInt();
 /*  array h ye  */       //           int marr []=new int[val];
  //       for ( int i=0;i<val ;i++){                       // input from user
   //          System.out.print(" enter your array elements at index " +i+" : ");
   //     marr [i] = sc.nextInt();
      //   }
     //   System.out.print(" your answer are below\n \n");
     //       int var=0;             // sum of array element nikalne ke liye hme bahar variable bnana padd rha b/c of bracket
     //   for ( int i=0;i<val ;i++){             // output printing
      //      var = var+marr[i];}              // sum ke liye
        //    System.out.println(var);
//            System.out.println(" your array element at at index " +i+" is : " +marr[i]*2 ); // hm final printing me multiply add wagera bhi kr skte hai}


//        ..............................................linear search
//        Scanner sc = new Scanner(System.in) ;
//        System.out.print(" enter your array size :  ");
//        int size = sc.nextInt();

//        int arr[] = new int[size ];    // array h ye

//        for(int i=0; i<arr.length; i++){   // yaha length ke liye arr.length likhna hoga ya toh...size hi likho sirf
//            System.out.printf(" enter your array element at index %d is : ",i);
//           arr[i]  = sc.nextInt();
//        }
//        System.out.print(" enter the element which u want to find : ");
//        int find = sc.nextInt();
//        for (int i=0;i<size;i++){                        // arr[i]  .... ye array ke andar ghusta h value ke liye aor elemnt check krta hai f
//            if (arr[i]==find){
//
//                System.out.println(" found at index : "+i);  // i me index aata h sirf i se
//            }
//        }



        // .....................................................found and not found concept
//        int arr[]= {1,2,3,45,};
//        int x=98;
//        boolean flag =false ;  // pahele toh nhi malum toh nhi mila usi liye false
//        for ( int i = 0 ; i<arr.length;i++){
//            if (arr[i]==x){
//            flag=true;break;}     // yaha mil gaya toh true ho jayega aor ruk jayega
//        }
//
//        if (flag==true)              // if else sath me rehne chahiye
//            System.out.println("found");
//            else
//                System.out.println(" not found ");


        //.........................................largest element/value find kaise kre















//  ******************************************************************  2d array basics

        // ............................................declaration + initialization
        //  int [][] name = new int [3][4];



        //...............................................direct initialization
        //  int [][] arr= {
        //          {3,4},
        //        {4,6,4,6,3},
        //      {2, 3}
        //    };

        //   System.out.println(arr.length);          // arr ki row length
        //   System.out.println(arr[0].length);      // arr ki column length when no. of element same
        //     System.out.println(arr[1][1]);            // apne se selected element  print krwana

        //        for(int row=0;row<arr.length;row++){              // sbhi element print krwana
        //          for (int col=0;col<arr[row].length;col++){
        //        System.out.print(arr[row][col]+" ");
        //  }
        //    System.out.println();
        //      }



//................................................................. input lena and output print krwana
//                                                   user se input of no. of row and column
//        Scanner sc=new Scanner (System.in);
//        System.out.print(" enter your no. of row and column:  ");
//        int row =sc.nextInt();
//        int col=sc.nextInt();
//        int arr [][]=new int [row][col];
//                                                                    user se input lena
//        for (int i=0; i<arr.length; i++){
//            for (int j=0;j<arr[i].length;j++) {
//                System.out.print("enter your row " +i+ " and column "+j+": ");
//               arr [i] [j]= sc.nextInt();
//            }
//        }
//        for(int m =0;m<arr.length;m++ ){
//            for(int n = 0; n<arr[m].length;n++){
//                System.out.print(arr[m][n]+" ");
//            }
//            System.out.println();
//        }

   //   ...&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&   rows aor column ke sum ke liye
   //     int sum=0;
//        for(int m =0;m<arr.length;m++ ){
//            for(int n = 0; n<arr[m].length;n++){
//                sum+=arr[m][n];



//.........................................sirf ek column ya row ka sum..prpduct nikalne ke liye
//        int sum=0;
//        int arr[][]= {
//                {1, 2, 3},
//                {2, 3, 4, 2}
//        };
//        for(int m =0;m<arr.length;m++ ) {             // yaha arr.length ki wajah se sirf 2 place tak hi sum nikal payega
//            sum += arr[1][m];            // row 1 ke sbhi element ke liye ya column m
//        }
//        System.out.println("the answer is "+sum);























































    }}
