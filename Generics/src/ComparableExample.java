import java.util.Date;

public class ComparableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    		Comparable c=new Date();
//    		System.out.println(c.compareTo("Monday"));
    	
    	Comparable<Date> comparable=new Date();
    	System.out.println(comparable.compareTo(new Date()));
    }
    
}
 