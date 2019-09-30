package search.analyzers;

public class Alibaba {
	public static void main (String[] args) {
		int[] test = {55,67,1,5,9,3};
		quickSort(test,0,test.length-1);
		for (int item:test) {
			System.out.print(item + " ");
		}
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if (left >= right) return;
		int pivot = array[(left + right) / 2];
		int mid = partition(array,left,right,pivot);
		quickSort(array,left,mid-1);
		quickSort(array,mid,right);
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
	
//	public static int[] mergeSort(int[] array) {
//		if (array.length == 1) return array;
//		int mid = array.length / 2;
//		int[] left = new int[mid];
//		int[] right = new int[array.length-mid];
//		for (int i = 0; i < mid; i++) {
//			left[i] = array[i];
//		}
//		for (int i = 0; i < array.length-mid; i++) {
//			right[i] = array[mid + i];
//		}
//		mergeSort(left);
//		mergeSort(right);
//		return merge(left,right);
//	}
//	
//	public static int[] merge(int[] left, int[] right) {
//		int totalLength = left.length + right.length;
//		int[] res = new int[totalLength];
//		int l = 0;
//		int r = 0;
//		for (int i = 0; i < totalLength; i++) {
//			if (l < left.length) {
//				if (.)
//			}
//		}
//	}
}
