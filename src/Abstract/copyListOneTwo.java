package Abstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copyListOneTwo {

    public static void main (String []args){

        List<String>fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Grape");
        System.out.println("List 1 is "+fruit);
        List<String>color = new ArrayList<String>();
        color.add("Blue");
        color.add("White");
        color.add("Pink");
        color.add("Black");
        System.out.println("List 2 is "+ color);
        Collections.copy(fruit,color);
        System.out.println("List 1 "+fruit);
        System.out.println("List 2 "+color);

    }

}
