import java.util.*;
public class first_nonduplicate_character
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.next();
		int i,j,a=0,c=0;
		String str2=new String(str);
		for(i=0;i<str.length();i++){
		    a=0;
		    if(str.charAt(i)!='$'){
		        for(j=i+1;j<str.length();j++){
    		        if(str.charAt(j)==str.charAt(i)){
    		            a=1;
    		            str=str.substring(0,j)+'$'+str.substring(j+1,str.length());
    		        }
    		    }
    		    if(a==0){
    		        c=1;
    		        break;
    		    }
    		    else{
    		        str=str.substring(0,i)+'$'+str.substring(i+1,str.length());
    		    }
		    }
		}
		if(c==1){
		    System.out.println("First Non-duplicate Character in the string \""+str2+"\" is "+str.charAt(i));
		}
		else{
		    System.out.println("Non-duplicate Character not found in the string \""+str2+"\"");
		}
	}
}
