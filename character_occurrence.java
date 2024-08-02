import java.util.*;
public class character_occurrence
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.next();
		System.out.print("Enter character to get its count: ");
		char ch=sc.next().charAt(0);
		int a=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==ch){
		        a++;
		    }
		}
		System.out.println(ch+" appears "+a+" times in the string \""+str+"\"");
	}
}
