package oops;   // ye class blueprint hai aor isi me variables constructors aor methods rahenge

class student {     // is class me kya kya hoga jo hmne bnai btana compulsary hai
    String name;
    int age;
    int rollno;

    student() {
        System.out.println("heyyy constructor call");   //constructor me code likhna optional hota hai
    }         // ye default constructor(optional agr nhi bnaoge to khud se ban jayega ) bnaya
    // isi constructor ki wajah se object ki value initialize hoti hai

   public void directcall() {              // method/function bnaya gaya warna br br main me sout likhna padta
        System.out.println(name);
        System.out.println(age);
    }
}

public class default1{
    public static void main (String[]args){


        student s1=new student();   //object bana yaha se aor constructor call hua automatically
        s1.name="prince";        // object ki values di gyi yaha
        s1.age=20;
        s1.rollno=65;

        s1.directcall();       // method call hua





    }
}

