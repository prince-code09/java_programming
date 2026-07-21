//encapsulation
//access modifier( 4 type ke hote  hai) ---private lagane se naame wagera kch bhi ni chnage kr kste ho
// default (kch na likho)--- same package ke andar sb log access kr skte hai && private --- sirf same class me hi use kr skte ho bs && public--- kahi bhi use kr sakoge && protected ---baki h
// ek .java file me sirf ek hi public class ho skti h aor wo bhi wo jiska naam pe .java file ho sirf whi class public ho skti hai  && ek class ka sirf ek hi main(psvma) rkh skte ho
// private krne ke bd hm dkh bhi ni skte & dekh sake uske liye aaya ---getters and jisko chahte h uska data change ho sake uske liye use krte h --- setters
// jaha pe hmari class ki property private ho aor bs use read kr paye ---us class ko bolte h read only class
//--- toString --- agr koi toString naam ka method h toh wo automatically call ho jayega ---(doubt)   ------otherwise bydefault address print krega
//   == operator value+adress dono comapre krta hai && String (==) isse compare nhi krte
//  .equals se 2 objects ko compare krwate h   --- && .this laga dete h taki ekdm perfect rhe agr ni bi lgaye tb bi chlega
// agr do object equal h toh uska hashcode bhi equal hoga
// jb bhi equal use kro usi sath hashcode bhi use kro  (rule type )
//aor hash aage padhenge jb inheritance pdhenge


package oops;

import java.util.Objects;

public class part2{
   private String name;
    private int age;

    part2 (String name,int age ) {                      // constructor
        this.name = name;
        this.age = age;
    }

   public  String getName(){                             // getter for name
        return this.name;
    }
    public int getAge(){                                   // GETTER FOR AGE
        return this.age;
    }
    public void setAge(int age ){                        // setters for age ___now we can change age
        if(age<0) return;                         // validation for setters
         this.age=age;
    }
    @Override                         //   equals and hashcode ka use and comaparison
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        part2 part2 = (part2) o;
        return this.age == part2.age && Objects.equals(this.name, part2.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    void pirintt(){                                          // final method for print
        System.out.println(this.name+"-"+this.age);
    }
}
 class dd {
    static void main(String[] args) {
        part2 s1= new part2("rahul",88);
     //   s1.name="nne";             private hogya is liye ab change aor access bhi ni kr skte
       s1.pirintt();
        System.out.println(s1.getName());        // getters se bs dekh skte h private wle ko bhi
        System.out.println(s1.getAge());
        s1.setAge(111);                           // setters se nyi value di gyi
        s1.pirintt();                       // after us of setters the age value is change


        part2 s2= new part2("rahul",111);
      //  System.out.println(s1==s2);      string compare ni krte == se
        System.out.println(s1.equals(s2));     // .equals() se compare krwaya gaya and isme actual content compare hota h sirf

        System.out.println(s1.hashCode());    //  hashcode
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode()==s2.hashCode());      // isse bhi compare krwa skte h --dono ka hashcode same hoga -true

    }
}