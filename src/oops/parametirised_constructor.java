package oops;
class college{
    String name;
    int age;
    int rollno;

    college(String n,int a,int r){                        // parametirised constructor
    name=n;
    age =a;
    rollno=r;
    }

    void displaying(){                          // function
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollno);
    }
}
public class parametirised_constructor {                              //yaha se hmari oroginal class start
    public static void main(String[]args){
        college c1=new college("prince ",20,65               // object bana
        );
        c1.displaying();                                   // method call hua






    }
}
