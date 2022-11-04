package hacs;

import java.util.*;

/**
 * Title:        HACS
 * Description:  SER515 : Unit Test and Reuse
 * @author Aaditya Muley
 * ASUrite : amuley2
 * ASU ID : 1225526185
 * @version 1.0
 */

public class ListIterator implements Iterator<Object> {
	ArrayList<Object> list;
	int currentNumber = -1;

	public ListIterator() {
	}

	public ListIterator(ArrayList<Object> list) {
		this.list = list;
	}

	public boolean hasNext() {
		if (currentNumber >= list.size() - 1)
			return false;
		else
			return true;
	}

	public Object next() {
		if (hasNext() == true) {
			currentNumber++;
			return list.get(currentNumber);
		} else {
			return null;
		}
	}

	public void remove() {
		list.remove(currentNumber);
	}
}