import.java.util.Calender;

public class javaCalender {

    public static void main (String[]args){

//create calender obj

        Calender mycal = Calender.getInstance();
        System.out.println("Todays :" + mycal.getTime());
}
