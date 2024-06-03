package Abstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffelList {

    public static void main (String[] args){

        List<String>shuffel = new ArrayList<String>();
        shuffel.add("1");
        shuffel.add("2");
        shuffel.add("3");
        shuffel.add("4");
        System.out.println("Before Shuffel number looks like"+ shuffel);
        Collections.shuffle(shuffel);
        System.out.println("After Shuffel "+ shuffel);


    }

}
