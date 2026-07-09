package oops;

class car{
    String name;
    int price;

//    car(){
//        System.out.println("this is constructor");
//    }

   public void call (){
        System.out.println("this is car in method "+this.name);  // this use krne se ek hi method se kaam hojata hai
        System.out.println(" this is price of car "+this.price);
    }
}

class sstudent {
    String name;
    int age ;
    sstudent(String name1, int age1){
         this.name=name1;
         this.age=age1;
    }
    public void call (){
        System.out.println(" "+this.name);  // this use krne se ek hi method se kaam hojata hai
        System.out.println(" "+this.age);
    }

}
public class clg {
public static  void main(String[]args){
//    car no=new car();
//    no.name="toyota";
//    no.price=370000;
//   no.call();
//
//   car no1 =new car ();
//   no1.name="mario";
//   no1.price=92929;
//   no1.call();

sstudent s1 =new sstudent("rahul", 32);
s1.call();
}}
