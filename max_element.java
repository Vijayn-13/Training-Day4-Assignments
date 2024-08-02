import java.util.*;
public class max_element
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    System.out.print("Enter element: ");
		    arr[i]=sc.nextInt();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		int max=arr[0];
		int i;
		for(i=1;i<n;i++){
		    if(arr[i]>max){
		        max=arr[i];
		    }
		}
		System.out.println("Maximum element: "+max);
	}
}
