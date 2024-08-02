import java.util.*;
public class basic_linear_search
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
		System.out.print("Enter element to search: ");
		int ans=sc.nextInt();
		int a=0;
		int i;
		for(i=0;i<n;i++){
		    if(arr[i]==ans){
		        a=1;
		        break;
		    }
		}
		if(a==1){
		    System.out.println("Element found at the index position of "+i);
		}
		else{
		    System.out.println("Element not found");
		}
	}
}
