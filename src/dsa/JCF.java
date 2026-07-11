// clone & ensureCapacity() & trimToSize()---sirf main wli reference se work krega aor ye rule dono arraylist aor linked list dono me valid h

// ensureCapacity() & trimToSize()--- ye sirf arraylist me work krenge linked me ni kyuki wo nodes se bani hoti hai--- isi tarah linkedlist me kch methods hote hai
// capacity(), FirstElement() , lastElement , elementAt()--- vector me use hone wale extra methods aor baki sare arraylist ke method vector me work krenge

// PRIMITIVE DATA TYPE NHI USE HONGE KYUKI WO OBJECTS NHI H AOR JCF OBJECT STORE KRTA H SIRF IS LIYE JAVA NE WRAPPER CLASSES BNAI aor whi use hongi---Integer ,Character , Double etc.
// custom object bhi bana skte h jaise Student, Mario etc . and iske baad primitive datatype or object (String) use krke value store krwao

package dsa;
import java.util.*;   //    * ka mtlb java.util package ki saari classes aor interfaces import krdo

// teeno alag interfaces hai
// import java.util.ArrayList;      // * wla likh diye toh ab inko likhne ki jarurat nhi hai
// import java.util.Collection;
//   import java.util.List;

public class JCF {
    public static void main (String []args){
 // ArrayList<Integre> --- reference type hai {generic bolte h isko}  || box--- refrence variable hai  || new ArrayList<>() ---ye object h
        ArrayList<Integer> box = new ArrayList<>();   // Arraylist class  reference  {object bnane ke tarike h ye 3 tarike arraylist me }
    //    List<Integer> box1=new ArrayList<>();         // list interface reference
    //    Collection<Integer> box2= new ArrayList<>();   // collection interface reference

        box.add(10);  box.add (20);  box.add(50);
        System.out.println(box);
        box.add (30);
        System.out.println(box);
        box.remove(0);            //  index se remove hota hai
        System.out.println(box);

        List<Integer> m= new ArrayList<>();
        
        m.add(90);   m.add(80);
        System.out.println("naya list m : "+m);
     box.addAll(m);       System.out.println("(box) me (m) add hone ke baad box : "+box);

       box.removeAll(m);    System.out.println("m ko removeAll krne ke baad: "+box);
        System.out.println("box size before clear: "+box.size());
        box.clear();         System.out.println("box size after clear : "+box.size());   System.out.println(box);

   //  iterator --- standard way to traverse in any collection
        Iterator<Integer> itt= m.iterator();
        while (itt.hasNext()){
            System.out.println("element : "+itt.next());
        }

        System.out.println(" \nnew list for all list wli type ke liye--------------------- \n");
        List<Integer> list =new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);

        System.out.println("using get : "+list.get(0));    //index se element deta hai
        System.out.println("before using set : "+list);
        list.set(0,90);
        System.out.println("after using set : "+list);
        System.out.println("contain check krta h element h ya ni :  "+ list.contains(100));
 //   arraylist ko array me convert krta hai

        System.out.println("\n arraylist ko array me convert krta hai ------------------\n ");
        Object[]arr=list.toArray();
        for(Object amm: arr){
            System.out.println(amm);
        }
     //   sorting in arrayList
        System.out.println("printing list "+list);  list.add(7);list.add(77);
        System.out.println("order before sorting : "+list);
       Collections.sort(list);   // list.sort(null);   (collection reference me ye dono nhi chlenge )
        System.out.println("order after sorting in ascending order  : "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sorting in descending order : "+list);
        System.out.println(list.indexOf(33));         //  element deke index batata hai
        System.out.println(list.isEmpty());         // batata h list empty h ya ni

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("linked list --- isme  5 refrences hote hai (queue & deque bhi implement karti h  ) " );
        System.out.println("isme bhi arraylist ke sbhi method same hote h jaisa upr likha hai ");
        LinkedList<Integer> stt = new LinkedList<>();   // objects isme 5 tarike h bnane ke 4 interfaces aor ek class

        System.out.println("\n -------------------------------------------------------------------------");
        System.out.println("vector me bhi sb waisa hi h aor isme 2 interface aor ek class reference hote h ");
        Vector<Integer> smtt = new Vector<>();     // cases sensitive h ye sb
       Collection<Integer> sts = new Vector<>();    // aise bhi ovjects bana skte h aor list ka bhi bana skte h


        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Stack--- collection *list* vector* insbke methods use kr skte hai stack me ");
        System.out.println("stack work on the principle of LIFO---last in first out ");
        System.out.println("push()--pop()--peek()--search()--empty()----ye extra methods h stack ke ");
        Stack<Integer> st = new Stack<>();

        st.push(100);       // element add krta h ye and sirf class reference me valid hoga ye
        System.out.println(st);
        st.push(200);
        st.push(300);            System.out.println(st);
         st.pop();             // element nikalta hai ye
      //  System.out.println(st.pop());   // kaun sa element niklega wo bhi dekh skte hai
        System.out.println(st);
        System.out.println(st.peek());    // sbse upr wla dikhata hai
        System.out.println(st.search(200));    // nhi mila tph -1 dega otherwise 1 ..2 piche se
      //  System.out.println(st.empty());



    }  }
