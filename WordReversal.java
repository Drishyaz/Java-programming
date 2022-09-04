//word reversal
//dog bites man --> man bites dog
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine().concat(" ");
		ArrayList <String> res = new ArrayList <> ();

    //this section stores every word in an arraylist
		String w="";
		for (int i=0;i<s1.length();i++) {
		    if (s1.charAt(i)==' ') {
		        res.add(w);
		        w="";
		    }
		    else
		        w += s1.charAt(i);
		}

    //this section prints the contents of the arrylist in reverse order
		for (int i=res.size()-1;i>=0;i--) 
		    System.out.print(res.get(i)+" ");
	}
}
