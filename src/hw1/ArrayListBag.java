package hw1;
/** This is the ArrayListBag class. It implements all the methods in the BagInterface and has a variable of ArrayList.
 * @author Zhuoming Li
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListBag<T> implements BagInterface<T> {

	private ArrayList<T> arrayList;
	
	public ArrayListBag(){
		arrayList = new ArrayList<T>();
	}
	
	/**This method overrides the getCurrentSize in BagInterface
	 * @param void
	 * @return int, the size of the ArrayList
	 */
	public int getCurrentSize() {
		return arrayList.size();
	}

	/**This method overrides the isEmpty in BagInterface
	 * @param void
	 * @return boolean, whether the ArrayList is empty or not
	 */
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	/**This method overrides the add method in BagInterface
	 * @param T, the generic type contained in the ArrayList
	 * @return boolean, if the T is added successfully
	 */
	public boolean add(T newEntry) {
		if (newEntry == null) return false;	
		return arrayList.add(newEntry);
	}

	/**This method overrides the remove() in BagInterface
	 * @param void
	 * @return T, the random T that is removed
	 */
	public T remove() {
		if (this.isEmpty()) return null;
		Random rand = new Random();
		int index = rand.nextInt(getCurrentSize());
		return arrayList.remove(index);
		
	}

	/**This method overrides the remove(T anEntry) in BagInterface
	 * @param T, a specific T in the ArrayList that needs to be removed
	 * @return boolean, if it is removed successfully
	 */
	public boolean remove(T anEntry) {
		return arrayList.remove(anEntry);
	}

	/**This method overrides the clear method in BagInterface. It deletes everything in the ArrayList
	 * @param void
	 * @return void
	 */
	public void clear() {
		arrayList.clear();
		
	}

	/**This method overrides the getFrequencyOf in BagInterface. It gives the number of votes for a name
	 * @param T
	 * @return int, the number of votes that has the same name with the parameter
	 */
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		Iterator<T> iter = arrayList.iterator();
		while (iter.hasNext())
		{Object other = iter.next();
			if (anEntry.equals(other)) frequency++;		
		}
		return frequency;
	}

	/**This method overrides the contains in BagInterface. It tests if the ArrayList has the T in it.
	 * @param T
	 * @return boolean
	 */
	public boolean contains(T anEntry) {
		return arrayList.contains(anEntry);
	}

	/**This method overrides the toArray in BagInterface. It iterates over the ArrayList and put the members in the Arraylist into an Array
	 * @param void
	 * @return T[], an array of generic type T
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		T[] array;
		int size = getCurrentSize();
		array = (T[])arrayList.toArray();
		return array;
	}
}
