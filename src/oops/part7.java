// Interfaces -- ye class ni contract h blueprintt h
// interface --- me sbhi method abstract aor public hote hai(bydefault) and they are only declared &&&& variables --public static final hote h (bydefault)
//  jitne bhi methods interface me banenge unko implement krna -compulsary h bahar implement means override
// after java 8 agr implement yhi krdo interface me method me toh force ni honge niche real class me override ke liye
// abstract aor interfaces ke objects ni ban skte but --- interface ke constructor bhi  ni ban skte
// also extend aor implement dono ek sath kr skte h but pahele extend then implement
// ek interface ko dushre se connect kr skte h extends se
package oops;
interface parent2{
    void pdhai();

    void m1();
static void m2(){                         // static ya default --default yaha likha jayega
    System.out.println("hello idhr hi implementation");
}
}

interface parent3{
void pdhai();
}
class child2 implements parent2,parent3{                        // multiple inheritance achieved
    @Override
    public void pdhai() {
        System.out.println("250 gb data ");
    }
    @Override
    public void m1() {
        System.out.println("upr bnaya toh idhr bhi implement kiya agr upr implement ni kiya ");
    }
}

public class part7 {
    static void main(String[] args) {
child2 obj = new child2();
obj.m1();











    }   }
