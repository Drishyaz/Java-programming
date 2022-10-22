import java.util.*;
public class gcd {
    //greatest common divisor (GCD) or highest common factor (HCF)
    int findGCD(int n1,int n2)
    {
        int g,l,h;
      //if any of them is negative the answer will be -1
        if (n1<0 || n2<0)
            return -1;
        else
        {
          /*here we will check if n1 is greater or n2, and store the greater one in 'h' and the smaller one in 'l'
          we will check if one number (h) is divisible by the other (l); if it is, we get the hcf = l (that is, the smaller one)
          So for e.g, the numbers are 8 and 16.
          n1 = 8, n2 = 16, then h = 16, l = 8.
          Now since h % l == 0 means 16 is perfectly divisible by 8, so the hcf has to be 8. You can try solving in paper.
          */

            if (n1>n2)
            {
                g = n1%n2;
                l = n2;
                h = n1;
            }
            else
            /*Lets take for example n1 = 24, n2 = 16.
            then h = 24 (greater one), l = 16 (smaller one).
            So (24 % 16 != 0), that means 24 divided by 16 doesn't leave the remainder 0.
            so we calculate the remainder which in this case is 8.
            Now we recursively call this function and pass 8,16.
            
            This time 16 % 8 == 0, so the hcf or gcd = 8.
            
            This way you can try solving with various numbers, e.g, 34 and 36, etc. You will get the correct output.
            */
            {
                g = n2%n1;
                l = n1;
                h = n2;
            }
            if (g==0)
                return l;
            else
                return findGCD(h%l, l);
        }
    }

    public static void main(String[] args) {
        //here we create an object for the gcd class, take inputs, and pass them to the function.
        gcd ob = new gcd();
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close(); //this line is optional except if you are coding in VS Code.
        System.out.println(ob.findGCD(n1,n2)); 
        //this statement directly prints the value returned by the recursive function.
    }
}
