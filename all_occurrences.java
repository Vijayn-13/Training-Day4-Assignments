import java.util.*;
public class all_occurrences
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of arraylist: ");
		int n=sc.nextInt();
		List<Integer> ls=new ArrayList<>();
		List<Integer> all_index=new ArrayList<>();
		for(int i=0;i<n;i++){
		    System.out.print("Enter element: ");
		    ls.add(sc.nextInt());
		}
		System.out.println("ArrayList: "+ls);
		System.out.print("Enter element to get all its index position: ");
		int a=sc.nextInt();
		int i;
		for(i=0;i<n;i++){
		    if(ls.get(i)==a){
		        all_index.add(i);
		    }
		}
		System.out.println("Indices position of "+a+": "+all_index);
	}
}
