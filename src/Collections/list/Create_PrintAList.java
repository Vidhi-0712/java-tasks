package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Create_PrintAList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Watermelon");
        fruits.add("Lychee");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Iteration using for each loop");
        for(String f : fruits){
            System.out.println(f);
        }

        fruits.remove("Banana");

        System.out.println("Iteration using Iterator");
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        if(fruits.contains("Mango")){
            System.out.println("Mango is on index :"+fruits.indexOf("Mango"));
        } else{
            System.out.println("List doesnt contain Mango ");
        }

    }
}
