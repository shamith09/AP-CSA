
public class BinSearchTester {

	public static void main(String[] args) {
		int[] scores = {16, 17, 21, 48, 52, 56, 58, 60, 65, 65, 73, 83};
		int targetScore = 65;
		
		System.out.println(binSearch(scores, targetScore, 0, scores.length-1));
	}

	public static String binSearch(int[] arr, int target, int start, int end)
	{
		if (start > end) return "Not found";
		int mid = (start + end)/2;
		if (arr[mid] == target)
			return "Found at index " + mid;
		if (arr[mid] < target)
			return binSearch(arr, target, mid + 1, end);
		return binSearch(arr, target, start, mid - 1);
	}
}
