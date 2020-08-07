import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> unsortedMap=new HashMap<Integer,String>();
		unsortedMap.put(100,"a");
		unsortedMap.put(90,"a");
		unsortedMap.put(80,"a");
		unsortedMap.put(70,"a");
		unsortedMap.put(60,"a");
		
		Map<Integer,String> sortedMap=new TreeMap<Integer,String>(unsortedMap);
		printMap(sortedMap);
		
		
	}

	public static <K,V> void printMap(Map<K,V> map) {
		 for (Map.Entry<K, V> entry : map.entrySet()) {
	            System.out.println("Key : " + entry.getKey()
					+ " Value : " + entry.getValue());
	        }
	}
}
