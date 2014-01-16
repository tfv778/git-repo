
@SuppressWarnings("unchecked")
public class Example<T> {
	private T[] data;
	private int size;
	
	public Example() {
		/**
		 * Eclipse will complain that the following cannot be done
		 * data = new T[];
		 * So instead, do this
		 */
		
		data = (T[]) new Object[10];
		size = 0;
	}
	
	public boolean add(T item) {
		if (size < data.length-1) {
			data[size++] = item;
			return true;
		}
		
		return false;
	}
	
	public T get(int index) {
		return (index < size ? data[index] : null);
	}
	
	public int size() {
		return size;
	}
}