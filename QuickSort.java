public class QuickSort {
	
	private Book[] myArr;
	private int len;
	
	public QuickSort(){
	}
	
	
	public void sort(Book[] arr){
		int len = arr.length;
		qsort(arr, 0, len-1);
		myArr = arr;
	}
	
	private void swap(Book[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void qsort(Book[] arr, int beginning, int end){
		
		if(beginning >= end) return;
		
		int i = beginning;
		int j = end;
		int pivot = (beginning + end)/2;
		
		while(i <= j) {
			
			while(arr[i] < arr[pivot]) {
				i++;
			}	
			while(arr[j] > arr[pivot]) {
				j--;
			}
			
		if(i <= j){
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		qsort(arr, beginning, j);
		qsort(arr, i, end);
	}
	
}