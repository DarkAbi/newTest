package Abstract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arrayList {

    public static void main (String[]args){

        List<String>fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Zanana");
        fruit.add("Orange");
        fruit.add("Grape");

        System.out.println(fruit);
        //After Sorting
        Collections.sort(fruit);

        System.out.println(fruit + "After the shorting");


    }

}
