import java.util.*;

public class piriyan {
    
    public static void main (String args []) {
        LinkedList<String>  List_one=new LinkedList<String>();

        List_one.add("Manusha");
        List_one.add("kalum");
        List_one.add("nethmi");
        List_one.add("Maheshi");

        Iterator<String> itr = List_one.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}