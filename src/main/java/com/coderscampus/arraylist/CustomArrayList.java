package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];								
	int elementCount = 0;
	
	@Override
	public boolean add(T item) {									// FLOW:					
		if (elementCount == items.length) {                       //when array is full
			Object[] updatedItems = new Object[items.length * 2]; //1. double array size
			for (int i = 0; i < items.length; i++) {			  //2. loop through existing elements in the items array
	            updatedItems[i] = items[i];						  //   copy each elements from item array to updatedItems	
	        }
	        items = updatedItems;								  //3. update items array reference to updatedItems
	        System.out.println("capacity: " + items.length);	  //4. print new capacity after resize. 
		}
		items[elementCount] = item; 
		elementCount++;
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return elementCount;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
			return (T) items[index];
	}
	
}
