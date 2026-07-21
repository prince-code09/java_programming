// ek  class bana rhe jo student ka data ko as a object store kre array me
// aor toString --- is liye use kr rhe taaki uska data dekh sake isme bydefault automatic hota h but wo useful info n deta toh hm khud se override krte h
// @Override mtlb parent ke method ko dubara apne version me likhna --- bydefault toSTring hota h na toh usi ko override krke hm apna likhte h tbhi btate h compiler ko ki override kiya
// @--- agr isko aage nhi lagaya toh java (annotation-Override ) ko variable smjh lega
// method override ki info deta h ye aor isi ko method overriding bolta hai
// garbage collector heap memory se data delete krta h and sirf null data yaani objects ko delete krna h .....unused data ko dlte ni krta
// java 16+ me --- record feature aaya isme read only file ko comment krke sirf 1 line likh ke apna object wla code rum krwa skte ho( doubt)
// static memory me pahale jate h tbhi static ke andar static ko cll kr skte h... static me static ni cll kr skte kyuki memory me non static bd me jeyega
//  static block one time setup hota h & class load hote hi ye chl jata h ---pahele .java .class me convert hui then JVM ne class load ki phr static block chla hen main() then object bana then constructor chla
// jis order me static vatiable ya static block likhe h usi order me excute  hote hai (top to bottom)
// jb bhi naya object banta h uske liye initialiser banta h

package oops;
import java.util.*;
public class part3 {
String name;
int age;
long phoneno;
// static clgname= "IIT delhi";    // yaha static laga h toh ye bina object ke bhi cll ho payega & ye hr jagah same bhi rhega

    public part3(String name, int age, long phoneno) {            // constructor
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
    }

    @Override                                    // toString
    public String toString() {
        return "part3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneno=" + phoneno +
                '}';
    }

    static void main(String[] args) {                             // yha se main() chla
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of student : ");
        int size = sc.nextInt();
        part3 [] arr = new part3[size];

        for(int i=0; i<arr.length;i++){              // andar ki values lere
            System.out.print("enter name of student "+ (i+1) +" : ");
            String name =sc.next();
            System.out.print("enter age of student "+( i+1) +" : ");
            int age =sc.nextInt();
            System.out.print("enter phoneno of student "+( i+1) +" : ");
           long  phoneno =sc.nextLong();

           arr[i]= new part3(name, age,phoneno);              // hr value ko obect bana ke store kr ra
        }

        for (int i=0; i<arr.length;i++){           // print  krwa rhe  --- use (toString )
            System.out.println(arr[i]);
        }









    }
}