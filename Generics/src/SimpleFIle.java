import java.util.ArrayList;
import java.util.Date;

public class SimpleFIle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    		ArrayList a=new ArrayList();
//    		a.add(15);
//    		a.add("15");
//    		Integer x=(Integer)a.get(1);
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	//list.add("15");
    	
    	Pair<Integer,String> map=new OrderedPair<Integer,String>(1,"Asjhwin");
    	Pair<String,Integer> map1=new OrderedPair<String,Integer>("Karki",2);	
    	
    	print(map.getKey(),map.getValue());
    	print(map1.getKey(),map1.getValue());
    	print("happy","birthday");
    	
    	
    	Person<Employee> p=new Person<Employee>();
    	Person<Contact> c=new Person<Contact>();
    	Employee x=new Employee("ashwin","karki", "1");
    	p.setPerson(x);
    	
    	Contact y=new Contact("1","anil","karki","23");
    	c.setPerson(y);
    	
    	System.out.println(p.toString());
    	System.out.println(c.toString());
    	
    	Integer[] x1= {144,23,4};
    	print(x1);
    	
    	String[] str= {"ashwin","suman"};
    	System.out.println(countGreaterThan(str,"asnil"));
    	
    	GenericInterface<Integer> n=new GenericInterfaceImplementation<Integer>();
    	
       	
    	GenericInterface<Person> perso=new GenericInterfaceImplementation<Person>();
    	perso.add(new Person<Employee>());
    	
    }
    
    public static <T extends Comparable<T>> int countGreaterThan(T[] list,T elem) {
    	int count=0;
    	for(T element:list) {
    		if(element.compareTo(elem)>0) {
    			count++;
    		}
    		
    	}
    	
    	return count;
    }
    
    public static <K,V> void print(K key,V value) {
    	System.out.println("key is"+key);
    	System.out.println("key is"+value);
    }
    
    
    public static <E> void print(E[] e) {
    	for(E l:e) {
    		System.out.println(l);
    	}
    }
    
}
