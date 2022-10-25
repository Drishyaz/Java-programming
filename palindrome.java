/* A number is said to be a PALINDROME number when its reverse is same as that number.
 * For e.g, 12321 , when we reverse it we get, 12321 which is same as original so its palindrome.
 * But for e.g, 12345 when reversed, it becomes 54321, so it's not palindrome.
 * 
 * In this program, I will show you TWO WAYS to solve this problem 
 * 1) Using NUMBER logic
 * 2) Using STRING logic
 */

import java.util.*;
public class palindrome {

    //This function will take the input of the number from user, and return it back to the main method.
    int input() {

        Scanner sc = new Scanner (System.in);
        //String num = sc.nextLine();
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    //this function will check for palindrome using NUMBER logic

    /* For e.g, n1 = 121, we store a copy of this variable in n2.
     * Everytime we check is this number is still more than 0, if yes,
     * then d = 1 (n2 % 10 extracts the last digit of any number),
     * then rev = 1, n2 = 12 (n2/10 removes the last digit.)
     * 
     * Fast forwarding...
     * n1 = 121, n2 = 121 | 12 | 1 | 0
     * n2 > 0 : yes | yes | yes | no
     * d = 1 | 2 | 1
     * rev = 1 | (1*10+2 =) 12 | (12*10+1 =) 121
     * 
     * Loop terminates...
     * rev == n1 (121 == 121 ?) : yes
     * "It's palindrome";
     * 
     * Similarly, try taking a non-palindrome number for e.g, 123.
     * 
     * Dry Run...
     * n1 = 123, n2 = 123 | 12 | 1 | 0
     * n2 > 0 : yes | yes | yes | no
     * d = 3 | 2 | 1
     * rev = 3 | (3*10+2 =) 32 | (32*10+1 =) 321
     * 
     * Loop terminates...
     * rev == n1 (321 == 123 ?) : no
     * "It isn't palindrome";
     */

    void num_pal (int n1) {
        int d,rev=0,n2=n1;
        while (n2>0)
        {
            d = n2 % 10;
            rev = rev * 10 + d;
            n2 = n2 / 10;
        }

        if (rev == n1)
            System.out.println("It's palindrome");
        else
            System.out.println("It isn't palindrome");

    }

    //this function will check for palindrome using STRING logic
    /*Basically, what we are doing here is, we are reversing the string, 
    then checking the reversed string is equal to the original string 
    or not. */

    void string_pal (String n1) {
        String rev = "";
        for (int i = n1.length() - 1; i >= 0; i--) {
            rev += n1.charAt(i);
        }

        if (rev.equals(n1))
            System.out.println("It's palindrome");
        else
            System.out.println("It isn't palindrome");

    }

    /*This is the main method, we create an object pb here, call input() method,
     *then we call the respective methods to check for palindrome.
     */
    public static void main(String[] args) {
        palindrome pb = new palindrome();
        int n = pb.input();
        System.out.print("Using NUMBER logic: ");
        pb.num_pal(n);

        String nm = String.valueOf(n);
        System.out.print("\nUsing STRING logic: ");
        pb.string_pal(nm);
        
    }
}
