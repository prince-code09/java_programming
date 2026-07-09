package dsa;
import java.util.*;   //    * ka mtlb java.util package ki saari classes aaor interfaces import krdo

// teeno alag interfaces hai
// import java.util.ArrayList;      // * wla likh diye toh ab inko likhne ki jarurat nhi hai
// import java.util.Collection;
//   import java.util.List;

public class JCF {
    public static void main (String []args){
 // ArrayList<Integre> --- reference type hai {generic bolte h isko}  || box--- refrence variable hai  || new ArrayList<>() ---ye object h
        ArrayList<Integer> box = new ArrayList<>();   // Arraylist reference
    //    List<Integer> box1=new ArrayList<>();         // list reference
    //    Collection<Integer> box2= new ArrayList<>();   // collection reference

        box.add(10);  box.add (20);  box.add(50);
        System.out.println(box);
        box.add (30);
        System.out.println(box);
        box.remove(0);            // remove index se hota hai
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























    }  }
