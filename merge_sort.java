import java.util.*;
public class merge_sort
{
    static void merge(int[] arr,int l,int m,int r){
        int n1=(m-l+1);
        int n2=(r-m);
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    static void merge_sort(int[] arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            merge_sort(arr,l,m);
            merge_sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
	public static void main(String[] args) {
		int[] arr={76,34,23,12,56,44,98,52,7,12};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		merge_sort(arr,0,arr.length-1);
		System.out.print("\nSorted array using merge sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}