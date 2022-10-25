/*We all have heard about 'Neil Armstrong' who was the first person to 
walk on moon. But this program of 'Armstrong number' has nothing to do
with him.

For e.g., 153, taking the cube of each of its digits and adding them,
cube(1) + cube(5) + cube(3) = 1 + 125 + 27 = 153
So the sum is the same as the original number.
So 153 is an armstrong number.

Another e.g, 24 = cube(2) + cube(4) = 8 + 64 = 72.
So 24 isn't armstrong number.*/

import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,s=0;
        int num = sc.nextInt();
        int n=num;
        sc.close();
        while (n>0)
        {
            d = n%10;       //extracting the last digit every time.
            s += d*d*d;     //calculating its cube and adding them to s variable.
          //So the s variable gets overwritten every time, with new values.
            n /= 10;        //removing the last digit
        }
        if (s==num)         //checking if the sum s is same as the original number num
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
