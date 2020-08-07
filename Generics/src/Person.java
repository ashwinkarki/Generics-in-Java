
public class Person<E> {
		
	public E e;
	
	public void setPerson(E e) {
		this.e=e;
	}
	
	public E getPerson() {
		return e;
	}

	@Override
	public String toString() {
		return "Person [e=" + getPerson() + "]";
	}
	
	
}
