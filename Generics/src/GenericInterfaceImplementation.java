
public class GenericInterfaceImplementation<T> implements GenericInterface<T> {

	T obj;
	
	@Override
	public void add(T t) {
		obj=t;
		System.out.println(obj);
	}
	
	

}
