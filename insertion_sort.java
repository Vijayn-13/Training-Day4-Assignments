import java.util.*;
public class insertion_sort
{
	public static void main(String[] args) {
		int[] arr={76,34,23,12,56,98,52,7,12};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		int temp,j;
		for(int i=1;i<n;i++){
		    temp=arr[i];
		    j=i-1;
		    while(j>=0 && arr[j]>temp){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=temp;
		}
		System.out.print("\nSorted array using insertion sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}