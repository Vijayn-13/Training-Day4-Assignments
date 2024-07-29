import java.util.*;
public class counting_sort
{
    static int[] counting_sort(int[] arr){
        int i,n,max=arr[0];
        n=arr.length;
        for(i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("\n\nMaximum number: "+max);
        int[] count=new int[max+1];
        Arrays.fill(count,0);
        for(i=0;i<n;i++){
            count[arr[i]]++;
        }
        System.out.println("\nCount array: "+Arrays.toString(count));
        for(i=1;i<=max;i++){
            count[i]+=count[i-1];
        }
        System.out.println("\nCumulative count array: "+Arrays.toString(count));
        int[] final_arr=new int[n];
        for(i=n-1;i>=0;i--){
            final_arr[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        return final_arr;
    }
	public static void main(String[] args) {
		int[] arr={64,97,23,56,44,98,76,34,64,97,23,56,23,44,98,76,34,64,97,12,52,7,12};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		arr=counting_sort(arr);
		System.out.print("\nSorted array using counting sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}