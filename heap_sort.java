import java.util.*;
public class heap_sort
{
    static void heap_sort(int[] arr){
        int n=arr.length;
        for(int i=(n-1)/2;i>=0;i--){
            heapify(arr,n,i);
        }
        System.out.println("\n\nArray after Heapify: "+Arrays.toString(arr));
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public static void main(String[] args) {
		int[] arr={98,76,34,64,97,23,56};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		heap_sort(arr);
		System.out.print("\nSorted array using heap sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}