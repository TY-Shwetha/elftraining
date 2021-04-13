package com.tyss.elftraining.common;

public class MainTest {

	public static void main(String[] args) {
		
		SortingMain ob = new SortingMain();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
		int n = arr.length;
		System.out.println("Before sorting");
		for (int i=0; i<n; ++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
        ob.sortByBubbleSort(arr);
        System.out.println("Sorted array:Bubble Sort");
        ob.printArray(arr);
        
        System.out.println();
        ob.sortBySelectionSort(arr);
        System.out.println("Sorted array:Selection Sort");
        ob.printArray(arr);
        
        System.out.println();
        ob.sortByInsertionSort(arr);
        System.out.println("Sorted array:Insertion Sort");
        ob.printArray(arr);
   
        System.out.println();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:Merge Sort");
        ob.printArray(arr);
   
//        System.out.println();
//        ob.sortByQuickSort(arr, 0, 6);
//        System.out.println("Sorted array:Quick Sort");
//        ob.printArray(arr);
//        
        System.out.println();
        ob.sortByHeapSort(arr);
        System.out.println("Sorted array:Heap Sort");
        ob.printArray(arr);
   
	}
}
