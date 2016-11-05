package ic.doc;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList<T> {

	private List<T> content = new ArrayList<T>();

	public boolean isEmpty() {
		return content.isEmpty();
	}

	public void add(T elem) {
		content.remove(elem);
		content.add(0, elem);
	}

	public int size() {
		return content.size();
	}

	public T get(int i) {
		return content.get(i);
	}
}
