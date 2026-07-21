// abstraction
// hiding the data --- data hide hota h encapsulation me- for security
// abstraction --- hiding the implementation or hiding the unnecessary implementation from users and show only necessary details
//ek bhi method abstract bnaya toh class ko bhi abstract bnana padega &&&&& abstract class ka object ni bna skte --- but it have constructor to achieve cons. chaining via (super bydefault)
// method ka implementation nhi dena toh use abstract bana do and baad me override krke implementation do
// extra -implicit meaning --- automatically
// private and static method cannot be abstract b/c they can't overridden

package oops;
abstract class animal{
   abstract void sound();
   void eat(){              // non abstract method bhi bana skte h - just example
          }
}
class dog extends animal{
    @Override
    void sound() {
        System.out.println("bhow bhow");
    }
}
class cat extends animal{
    @Override
    void sound() {
        System.out.println(" meow meow");
    }
}

public class part6 {
    static void main(String[] args) {
    cat m = new cat();
    m.eat();




}       }
