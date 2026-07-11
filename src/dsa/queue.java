// queue work on the principle of FIFO
//  queue me insertion hmesa rear(end) se hoga aor removal (front) se .
// Deque(douballly ended que)--- isme bhi add etc krne ke liye offerfirst etc h (ecxeption se bachane ke liye )---value false ya null return krte h exception nhi krte
//---lekin isme addFirst wagera bhi hote h lekin eception throw krenge

//*************(LIFO)*******  Stack bhi use kiya ja skta h arraydeque ko implement krne ke liye (doubt)---stack ke extra methods (push(), pop())

// PriorityDeque {poll()}----default behaviour -> integers -> less value -> high priority -> minheap -ye ek data structure h
// comparator me expression add krke maxheap bana skte h integers ke liye isko se krke { (a,b)-> b-a }

package dsa;
import java.util.*;
public class queue {
    public static void main(String[]args){

        System.out.println("linked list in queue---------------------------------------------------------");
        Queue<Integer> qt= new LinkedList<>();
        qt.offer(10);          // queue me exception handling se bachne ke liye add krne ke liye offer use krte h
        qt.offer(20);
        qt.offer(30);              System.out.println(qt);

        System.out.println("polling : "+qt.poll());   // remove ka kaam krta h poll acc. to FIFO
        System.out.println("peeking : "+qt.peek());   // pahela element dega ye

        System.out.println("\n\n-----------------------------------------------------");
        System.out.println("ArrayDeque ----------------");
        Deque<Integer> qtt= new ArrayDeque<>();
        qtt.offer(10);             qtt.offerLast(40);
        qtt.offerFirst(11);
        qtt.offerLast(12);                   System.out.println(qtt);
        qtt.pollFirst();                   System.out.println(qtt);
        qtt.pollLast();                 System.out.println(qtt);
        System.out.println(qtt.size());

        System.out.println(qtt.peekLast());   // peeklast....peekfirst... ya peek sirf pahela element dega

        System.out.println("\n\n priorityDeque------------------------------------------------");
        Queue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        pq.offer(20);
        pq.offer(21);    pq.offer(22);        System.out.println("printing new one pq : "+ pq);
        System.out.println("polling : "+ pq.poll());   // default polling
        System.out.println(pq);









}}
