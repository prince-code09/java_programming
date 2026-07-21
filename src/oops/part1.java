//  lecture from ---not your college 

// method agr object ka data use kre toh static mat use kro && ek .java file me hi kaam kr rhe ho toh method ko public bnane ki jarurat nhi h (depend on mood)
//instance variable dher saare object ke liye bnate h && local variable sirf method ke andar hota h and call hoke use hoke khatam means ek br use aake khatam
//instance variable default value le skte h lekin local variable nhi le skte h
// this keyword is liye laya gaya kyuki--- method me instance variable me value de paye aor local ka naam smjh aaye agr same nam rakhenge this nhi use krenge toh error aayega aor n..w.e.e ye sb naam rakhenge toh baad me pahechanne me confussion hogi
// agr chahe toh ek hi method se value leke usi se print bhi krwa skte h but ---not prefer b/c readibility ...etc
//---ab aaya constructor ---constructor bhi ek method h aor object banne me constructor automatic call hoja ra ---agr constructor method use ho hi ra toh usi me value store krwao aor input do
//
//  constructor ka naam aor class ka naam same hona chahiye and ye ek special method h toh isme return type (void) bhi nhi hota kyuki ye special method h agr return type de denge toh ye bakio jaisa ho jayega aor automatic khud ko call nhi kr  payega
// static tab aata h jb object ni hota && this tb aata h jb object hota h then no static kyuki object h to this h
 //method overloading ki tarah constructor overloading bhio hoota hai
// this()keyword is also used for constructor chaining ek object bana ke sbhi constructor ko cll kr skte h
// .this keyword instance variable ko access krta h


package oops;

public class part1 {
    String name;
    int age;

    part1(String name){                // sirf name ke liye constructor --constructor overloading (isme sirf ek object wla call hoga )
        this.name =name;
    }
    part1(String name , int age ){                      // jitni br naya method banega utni br constructor call hoga
        this.name =name;   // yaha this mtlb current object ko call kr rha
        this.age=age;
    }

void print(){
    System.out.println(this.name+"-"+this.age);
}
}

class demo {
    static void main(String[] args) {
        part1 nn= new part1("brohh");
        nn.print();
        part1 s1 =new part1("golu",12);
       // s1.name="golu";
       // s1.age=30;
   //      s1.meth();    // isse code chhota hogya aor yaha method call hua value s1. me gyi aor local variable me stor hui and pahechan btaya ki name = local variable me ye store ho
      //  System.out.println(s1.age+s1.name);   // print krne ke liye bhi br br likhna na pade is liye method bana liye
        part1 s2 =new part1("rahul", 30);
        part1 s3 =new part1("shyam",10);

        s1.print();
        s2.print();
        s3.print();











    }
}