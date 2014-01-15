package hw1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListBag<T> implements BagInterface<T> {

	private ArrayList<T> arrayList;
	
	public ArrayListBag(){
		arrayList = new ArrayList<T>();
	}
	
	@Override
	public int getCurrentSize() {
		return arrayList.size();
	}

	@Override
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	@Override
	public boolean add(T newEntry) {
		if (newEntry == null) return false;	
		return arrayList.add(newEntry);
	}

	@Override
	public T remove() {
		if (this.isEmpty()) return null;
		Random rand = new Random();
		int index = rand.nextInt(getCurrentSize());
		return arrayList.remove(index);
		
	}

	@Override
	public boolean remove(T anEntry) {
		return arrayList.remove(anEntry);
	}

	@Override
	public void clear() {
		arrayList.clear();
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		Iterator<T> iter = arrayList.iterator();
		while (iter.hasNext())
		{Object other = iter.next();
			if (anEntry.equals(other)) frequency++;		
		}
		return frequency;
	}

	@Override
	public boolean contains(T anEntry) {
		return arrayList.contains(anEntry);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		T[] array;
		int size = getCurrentSize();
		array = (T[])arrayList.toArray();
		return array;
	}
}
