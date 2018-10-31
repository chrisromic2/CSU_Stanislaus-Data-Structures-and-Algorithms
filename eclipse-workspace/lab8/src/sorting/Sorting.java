package sorting;

import priorityQueue.MinHeap;

public class Sorting<T extends Comparable<T>> {

	private boolean lessThan(T data1, T data2) {
		if (data1.compareTo(data2) < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean largerThan(T data1, T data2) {
		if (data1.compareTo(data2) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean equalTo(T data1, T data2) {
		if (data1.compareTo(data2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void swap(T[] arr, int index1, int index2) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public void show(T[] arr, String whichSort) {
		System.out.print(whichSort + ": ");
		for (T data: arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public void insertionSort(T[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (lessThan(arr[j], arr[j-1])) {
					swap(arr, j, j-1);
				} else {
					break; // exit inner(j) for loop
						   // that is,
						   // stop moving to the left
				}
			}
			
		}
	}
	
	public void bubbleSort(T[] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr.length-1-i; j++) {
				if (largerThan(arr[j], arr[j+1])) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public void selectionSort(T[] arr) {
		int largestIndex = 0;
		for (int i=0; i < arr.length; i++) {
			largestIndex = 0;
			for (int j=1; j < arr.length-i; j++) {
				if (largerThan(arr[j], arr[largestIndex])) {
					largestIndex = j;
				}
			}
			swap(arr, largestIndex, arr.length-1-i);
		}
	}
	
	private int getMaxIncrement(T[] arr) {
		
	}
	
	public void shellSort(T[] arr) {
		
	}
	
	private insertionSort(T[] arr, int incr) {
		
	}
	
	private insertionSort(T[] arr, int start, int incr) {
		
	}
	
	public void heapSort(T[] arr) {
		// create a min heap after heapify
		MinHeap<T> heap = new MinHeap<T>(100, arr);
		
		/*
		 	get smallest values repeatedly,
		 	and put them back to array
		*/
		int index = 0;
		while (heap.size() > 0) {
			arr[index++] = heap.get();
		}
	}
}
