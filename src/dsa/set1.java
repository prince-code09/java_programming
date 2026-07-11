// set me repetation nhi hota and iske andar sbhi me apply hoga ye
// important methods ----addAll() , retainAll() , removeAll() , containsAll
// psvma
package dsa;
import java.util.*;
public class set1 {
    static void main(String[] args) {
        System.out.println("hashset----------------------------------");  //hashcode() wla method baad mein
        // duplicate se bachane ke liye hashset laya gaya mainly
        // repetation nhi hoti  and random wise deta h element ka stores printing me  and isme index nhi hota
        // hashset hr ek element ke liye unique hashcode generate krta hai
        Set<Integer> st = new HashSet<>();
        Set<Integer> st1 = new HashSet<>();

        st.add(20);
        st.add(30);
        st.add(40);

        st1.add(30);
        st1.add(40);
        st1.add(50);
        System.out.println(st);
        st.retainAll(st1);        // common values deta h sirf dono me se
        System.out.println(st);
        System.out.println(st1);
        System.out.println(st.containsAll(st1));   // check krta h ye ki saare elements h ya ni {st} me


        System.out.println("\n\nlinkedhashset------------------------------------------------------");
        // isme ordered element deta h aor hashset me random dega printing me  and repeat ni hoti isme bhi
        Set<Integer> stt = new LinkedHashSet<>();
        stt.add(5);
        stt.add(2);
        stt.add(2);
        stt.add(4);
        System.out.println(stt);


        System.out.println("\n\n TreeSet------------------------------------------------");
        // isme sorted element deta h printing me and repetation nhi hota isme bhi
      //  baki upr dono ek me random wise aor ek me ordered wise aor isme(TreeSet) ascending wise
        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(10);
        ts.add(40);
        ts.add(30);
        System.out.println(ts);


        // HashedSet -> O(1) ------------randomly element paare
        //LinkedHashedSet -> O(n)------------jis order me dere us order me paare
        // TreeSet -> O(logn)--- and TreeSet ki implementation binary search tree pe based hoti hai------------sorted based me element dera





    } }
