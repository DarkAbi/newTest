package Abstract;

import java.util.*;

public class collectionPractise {

    public static void main(String[] agrs) {

   List<String>colors = new ArrayList<String>();
   colors.add("White");
   colors.add("Blue");
   colors.add("Green");
   colors.add("Red");

   if (colors.contains("Green")){
       System.out.println("Red color found");
          }else {
       System.out.println("Red color not found");
   }

    }
}



