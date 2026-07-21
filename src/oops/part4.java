//   Inheritance--- code ko reuse krna ya variables ya methods ko acces reuse krna
// ek parent ek child h toh ise ---single inheritence  &&& multilevel --- kai class   &&& miltiple inheritence allow ni hota java me *** interface ki help se kr skte h (gives diamond problem)
// hierarchial inheritance--- ek parent kai child aor child child ka data ni access kre sirf parent ka kre   &&& hybrid inheritance bhi ni allow *** allow h sirf interface ki help se (gives diamond problem)
// parent class ko hi ye bolte h =super class =base class   &&&  child class = subclass=derived class bhi bolte hai
// (is a) relationship --- child is a parent || dog is a animal ye shi h lekin ye ni nol skte -- animal is a dog
// object class || ya cosmic superclass bolte h --- bs jaan lo no use   {extends object jo line 11 me likha hai }
// super keyword se parent ki  --- properties(variable) ---  methods ---constructor---- access kiye ja skte h &&&&***  super sirf child class ke non-static methods ya constructor ke andar use ho skta h (this -also)
//--- constructor chaining me agr parent me 1 constrctor h  parametirised toh child wle me default bna dete ho toh error show hoga ---kyuki bydefault wla cll hoga aor agr ek constructor parametrised bana h toh default ni bn skta (aor extend hota h toh child me this automatic aa jata h is liye error aata h )
//--- this() in parent cons. --- agr default na hua parametirised hua toh this(value) daalni pdegi
// this() same class ke constructor ko cll krta h and super() dushri class ke constructor ko cll krta hai **** aor ye dono hmea 1st line me hone chahiye cons. ke for cons. chaining ya calling
// this aor super dono same cons. me ni use kr skte
// super by default hota h for non parametirised constructor ke liye
package oops;

class parent {                         // yha extend object bydefault hota h & isi ko object class bhi bolte hai
    int x=10;
    parent(int a){                     // constructor h ye parametirised
       this();                               // isko use krne se parent ka default constructor ko cll krega agr wo na hua aor this() use kiya toh error aayega (coompile error)
        System.out.println("parametirised  constructor in parent ");
    }
    parent(){                     // constructor h ye default
        System.out.println("default constructor in parent ");
    }
    public void m1(){                      // method h ye
        System.out.println("this is class parent and method m1");    }

}

class child extends parent {
    int x=1000;
    child(){                              // default costructor h ye aor ye constructor chaining ke liye kr rhe
           //  super();                        // super keyword ka use krke hm yha se parent class ke constructor ko cll kr skte h and by default hota h ye no need to write
      super(11);                  // cons. chaining--agr upr parametirised cons bnaya h toh niche usko cll ke liye this use krke value do value ni denge toh default ko cll krega upr wle ka aor default bnega ni kyuki parametirised bnaye h hm
        System.out.println("default constructor in  child ");
    }
    child(int m ){                        // parametirised constructor
        System.out.println(" child ");
    }
    public  void m2(){                     // method h ye
        int x=20;
//        System.out.println(x);
//        System.out.println(this.x);
//        System.out.println(super.x);
 //       super.m1();
    System.out.println(" this is class child and method m2 ");      }

}

public class part4 {
    static void main(String[] args) {
        child obj = new child();   //agr yha value dal doge to value wla constructor chlega  (yha ki value ke hisab se cons. choose hoga )



}    }
