public class selection_sort
{
	public static void main(String[] args) {
		int[] arr={76,34,23,12,56};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		int min_index,temp;
		for(int i=0;i<n-1;i++){
		    min_index=i;
		    for(int j=i+1;j<n;j++){
		        if(arr[min_index]>arr[j]){
		            min_index=j;
		        }
		    }
		    temp=arr[min_index];
		    arr[min_index]=arr[i];
		    arr[i]=temp;
		}
		System.out.print("\nSorted array using selection sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}