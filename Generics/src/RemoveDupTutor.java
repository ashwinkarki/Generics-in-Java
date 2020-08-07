import java.util.ArrayList;

public class RemoveDupTutor {
	
	public static void main(String[] args) {
			ArrayList<String> strList=new ArrayList<String>();
			strList.add("Red");
			strList.add("Green");
			strList.add("Blue");
			strList.add("Red");
			
		ArrayList<String> nodup=removeDups(strList);
		System.out.println(nodup);
	}

	
	public static <E extends Comparable<E>> ArrayList<E> removeDups(ArrayList<E> list){
		boolean found=false;
		if(list.size()==0) {
			return list;
		}
		ArrayList<E> newList=new ArrayList<E>();
		newList.add(list.get(0));
		
		for(int i=1;i<list.size();i++) {
			for(int j=0;j<newList.size();j++) {
				if(list.get(i).compareTo(newList.get(j))==0) {
					found=true;
					break;
				}
			}
			if(found!=true) {
				newList.add(list.get(i));
				found=false;
			}
		}
		return newList;
	}
}
