package com.tyss.elftraining.common;

public class SortingMain {

	public  void sortByBubbleSort(int arr[]) {
		//System.out.println("Bubble Sort");
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}

	public  void sortBySelectionSort(int arr[]) {
		//System.out.println("Selection Sort");
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) { 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	}

	public  void sortByInsertionSort(int arr[]) {
		//System.out.println("Bubble Sort");
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public  void sortByMergeSort(int arr[], int l, int m, int r) {
		//System.out.println("Bubble Sort");

		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r){
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			sortByMergeSort(arr, l, m, r);
		}
	}

//	public static int partition(int a[], int beg, int end)  {  
//		//		System.out.println("Quick Sort");     
//
//		int left, right, temp, loc, flag;     
//		loc = left = beg;  
//		right = end;  
//		flag = 0;  
//		while(flag != 1)  {  
//			while((a[loc] <= a[right]) && (loc!=right))  
//				right--;  
//			if(loc==right)  
//				flag =1;  
//			else if(a[loc]>a[right])  {  
//				temp = a[loc];  
//				a[loc] = a[right];  
//				a[right] = temp;  
//				loc = right;  
//			}  
//			if(flag!=1)  {  
//				while((a[loc] >= a[left]) && (loc!=left))  
//					left++;  
//				if(loc==left)  
//					flag =1;  
//				else if(a[loc] <a[left])  {  
//					temp = a[loc];  
//					a[loc] = a[left];  
//					a[left] = temp;  
//					loc = left;  
//				}  
//			}  
//		}  
//		return loc;  
//	} 
//
//	static void sortByQuickSort(int a[], int beg, int end)  {  
//
//		int loc;  
//		if(beg<end)  {  
//			loc = partition(a, beg, end);  
//			sortByQuickSort(a, beg, loc-1);  
//			sortByQuickSort(a, loc+1, end);  
//		}  
//	}  
//

	public void sortByHeapSort(int arr[]) {
		//System.out.println("Bubble Sort");

		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}


	public void sortByBucketSort() {
		System.out.println("Bubble Sort");
	}

	public void sortByRadixSort() {
		System.out.println("Bubble Sort");
	}

	void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
