/*
Starting with an input string of words, find the Nth word of the string.
For example, an input of “I love Coding”, with N=2, should return “love.”
For the string “I can program in Java” and N = 3, the output should be the third word, “program.”
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine()+" ";
		  String w = "";
		
		  int n = sc.nextInt();
		  int c=0;
		  for (int i=0;i<s.length();i++)
		  {
		    
		      if (s.charAt(i)==' ') {
            c++;
            if (c==n)
		          break;
		        else
		          w="";
          }
		        
		      else
		          w += s.charAt(i);
		          //I love Coding 
		  }
		System.out.println(w);
	}
}
