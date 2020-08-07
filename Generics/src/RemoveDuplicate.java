import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {
	
	public static  void main(String[] args) {
		Integer[] i= {12,12,12,12,5,2,42,4,2,5,3,35,3,1,23,54,44};
	List<Integer> intList=removeDuplicates(i);
	System.out.println(intList);
	}
	
	public static <T extends Number> List<T> removeDuplicates(T[] list) {
		Map<T,Integer> duplicateCounr=new HashMap<T,Integer>();
		for(T t:list) {
			
		   Integer x=duplicateCounr.get(t);
		  
		   if(x==null) {
			   duplicateCounr.put(t,1); 
		   }
		   else {
			   Integer count=duplicateCounr.get(t);
			   duplicateCounr.put(t,++count); 
		   }
		}
		List<T> nList=new ArrayList<>();
		
		for (Map.Entry<T, Integer> entry : duplicateCounr.entrySet()) {
			T key = entry.getKey();
			Integer vk = entry.getValue();
			if(vk>1) {
				nList.add(key);
				System.out.println("Duplicate" + key + ", Count: " + vk);
			}
			
		}
		return nList;
	}

}
