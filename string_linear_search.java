import java.util.*;
public class string_linear_search
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<arr.length;i++){
		    System.out.print("Enter string: ");
		    arr[i]=sc.next();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.print("Enter string to get the index: ");
		String ans=sc.next();
		int a=0;
		int i;
		for(i=0;i<n;i++){
		    if(arr[i].equals(ans)){
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
