public class bubble_sort
{
	public static void main(String[] args) {
		int[] arr={76,34,23,12,56,98,52,7,12};
		int n=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		int temp;
		for(int i=0;i<n;i++){
		    for(int j=1;j<n-i;j++){
		        if(arr[j-1]>arr[j]){
		            temp=arr[j-1];
		            arr[j-1]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		System.out.print("\nSorted array using bubble sort: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}