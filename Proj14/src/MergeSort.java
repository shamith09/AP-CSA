
public class MergeSort {
	private static int[] temp;
	
	public static void sort(int[] arr)
	{
		recursiveSort(arr, 0, arr.length-1);
	}
	private static void recursiveSort(int[] arr, int from, int to)
	{
		if (from >= to) return;
		
		int mid = from + (from + to)/2;
		recursiveSort(arr, from, mid);
		recursiveSort(arr, mid+1, to);
		
		merge(arr, from, mid, to);
	}
	private static void merge(int[] arr, int from, int mid, int to)
	{
		for (int i = from; i <= to; i++) {
	      temp[i] = arr[i];
	    }

	    int i = from;
	    int j = mid + 1;
	    int k = from;
	    // Copy the smallest values from either the left or the right side back to the original array
	    while (i <= mid && j <= to) {
	      if (temp[i] <= temp[j]) {
	        arr[k] = temp[i];
	        i++;
	      } else {
	        arr[k] = temp[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= mid) {
	      arr[k] = temp[i];
	      k++;
	      i++;
	    }
	     //Add
	     // Copy the rest of the right side of the array into the target array
	    while (j <= to) {
	      arr[k] = temp[j];
	      k++;
	      j++;
	    }
	}
}
