// method overriding pdh rhe isme ---3:40
//method overriding kya hota h --- child class provide new implementation for parent's method(method name ,parameter,return type, access modifier ka thoda role-- must be same-rule for this one)
// m1() && m1(int a)--- ye method overloading ho jayegi
// static methods cannot bhi overridden
// polymorphism 2 types --- run time( achieved by method overriding)== also known as late binding . and compile time polymorphism( achieved by method overloading)== also known as early binding
// extra --- static laga h ksi me usko dushri class me access krne ke liye class name se cll krna hoga

// final keyword --- ksi cheej , method ya variable ya class-(mtlb phr class ko koi extend nhi kr skta  )   ko constant bana deta hai
// aor static me final kroge aor value(variable) ni doge toh sirf static me hi uska value de paoge means sirf static me hi declare kr paoge
//class ko final bna diya toh uske andar sb final ho jayega lekin variable ni hoga final


package oops;
class parent1{
   public void m1(){
        System.out.println(" parent1 m1");
    }
}
class child1 extends parent1{
    @Override                       // optional h ye likhna --btata h compiler ko ki overiding hui hai
   public void m1(){
        System.out.println(" child1 m1");
    }
}



 public class part5 {
    static void main(String[] args) {
      final int a=10;                                                     // final keyword
      //  a=90;    // through error b/c final keyword
        System.out.println(a);

    child1 obj = new child1();
    obj.m1();



}   }
