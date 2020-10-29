import java.util.Scanner;

public class MergeSortAlgo {

	void merge(int arr[], int beg, int mid, int end){  

		int l = mid - beg + 1;  
		int r = end - mid;  

		int leftarr[] = new int [l];  
		int rightarr[] = new int [r];  

		for (int i = 0; i < l; ++i)  
			leftarr[i] = arr[beg + i];  

		for (int j = 0; j < r; ++j)  
			rightarr[j] = arr[mid + 1+ j];  


		int i = 0, j = 0;  
		int k = beg;  
		while (i<l && j<r){  
			if (leftarr[i] <= rightarr[j]){  
				arr[k] = leftarr[i];  
				i++;  
			}else{  
				arr[k] = rightarr[j];  
				j++;  
			}  
			k++;  
		}  
		while (i<l){  
			arr[k] = leftarr[i];  
			i++;  
			k++;  
		}  

		while (j<r){  
			arr[k] = rightarr[j];  
			j++;  
			k++;  
		}  
	}  

	void sort(int arr[], int beg, int end)  {  
		if (beg < end) {  
			int mid = (beg+end)/2;  
			sort(arr, beg, mid);  
			sort(arr , mid+1, end);  
			merge(arr, beg, mid, end);  
		}  
	}  
	
	public static void main(String args[])  {  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		
		int arr[] = new int[n]; 
		System.out.println("Enter array elements:");
		for(int i = 0; i < n; ++i)
			arr[i] = sc.nextInt();
		
		MergeSortAlgo ms = new MergeSortAlgo();  
		ms.sort(arr, 0, arr.length-1);  

		System.out.println("\nSorted array");  
		for(int i =0; i<arr.length;i++)  {  
			System.out.print(arr[i] + " ");  
		}  
		
		sc.close();
	}  
}
