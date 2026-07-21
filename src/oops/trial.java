// static se non static ko cll nhi kr skte
// printsum kai h isi ko method over loading bolte h-----isi ko polymorphism bbhi bolte hai
// compile time polymorphism(isi ko early binding bhi bolte hai ) me hm dekh ke bata pate h kaun sa method cll hora means compile time me hi pta chl jara
//same method name diffeerent parameter ----method overloading bolte hai




package oops;

public class trial {
     int printsum (int a ,int b ){
        return a+b;
    }
    double printsum (double a ,double b ){
        return a+b;
    }
    long printsum (long a ,long b ){
        return a+b;
    }
    int printsum (int a ){
        return a;
    }
   public static void main(String[] args) {

         trial mm =new trial();

       mm.printsum(22,77);





}   }
