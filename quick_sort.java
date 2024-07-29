import java.util.*;
public class quick_sort
{
    static int partition(int[] arr,int l,int r){
        int pivot=arr[r];
        int i=l-1;
        int temp;
        for(int j=l;j<r;j++){
            if(arr[j]<pivot){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        temp=arr[i];
        arr[i]=pivot;
        arr[r]=temp;
        return i;
    }
    static void quicksort(int[] arr,int l,int r){
        if(l<r){
            int partition_index=partition(arr,l,r);
            quicksort(arr,l,partition_index-1);
            quicksort(arr,partition_index+1,r);
        }
    }
	public static void main(String[] args) {
		int[] arr={76,34,23,12,56,44,98,52,7,12};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		quicksort(arr,0,n-1);
		System.out.print("\nSorted array using quick sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}