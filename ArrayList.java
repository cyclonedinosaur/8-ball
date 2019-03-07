public class ArrayList {

	// private instance variables
	private int[] data; // array to hold data
	private int size; // tracks how many elements are valid in the array

	// constuctor
	public ArrayList() {
		data = new int[2];// array w 2 vals
		size = 0;// size starts as 0
	}

	// getter for an element at index i
	public int get(int index) {
		return data[index];
	}

	// getter for the size instance variable
	public int size() {
		return size;
	}

	// given an integer, el, add it to the next open spot

	public void add(int el) {
		// check if it is not okay to add
		if (size >= data.length) {

			// grow the array... but by how much?

			int[] bigger = new int[size + 1]; // make a bigger array that can
												// contain 1 more element

			// copy over the elements from the data array onto the bigger array.

			for (int i = 0; i < data.length; i++) {
				bigger[i] = data[i]; // copy from data array into bigger array
			}

			data = bigger; // the new data array needs to point to the bigger
							// array
		}

		// add element into the next spot
		data[size] = el;
		size++; // update size

	}

	/*
	 * given an index i, remove the element at that index and shift all elements to
	 * the right of it to the left by one
	 * 
	 */
	public void remove(int index) {

		for (int i = index; i < data.length - 1; i++) {
			data[i] = data[i + 1];// shifts everything after index to left by one
		}
		size--; // shrinks size a little

	}

	public int remove() {
		int x = data[size - 1];// get element at index of size
		size--;// shrink size
		return x;// return original el
	}

	public int[] getData() {// getter for data
		return data;
	}
}
