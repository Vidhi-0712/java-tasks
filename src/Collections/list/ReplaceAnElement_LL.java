package Collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class ReplaceAnElement_LL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Good Morning");
        ll.add("Good Afternoon");
        ll.add("Good Evening");
        ll.add("Good Night");

        ll.set(2,"Updated");

        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
