import java.util.*;
public class first_occurrence_number
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
		System.out.print("Enter element to find its first occurrence index: ");
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
		    System.out.println(i);
		}
		else{
		    System.out.println(-1);
		}
	}
}
