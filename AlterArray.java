//CLOUDKAPTAN TR ROUND
/*
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively, i.e, first 
element should be max value, second should be min value, third should be second max, fourth should be seconf min 
and so on.

Input:
Enter the size of array: 6
Enter the elements: 1 2 3 4 5 6

Output:
6 1 5 2 4 3
*/

import java.util.*;
class Main {
  public static void main(String args[]) {
    ArrayList <Integer> ar = new ArrayList<> ();
    ArrayList <Integer> newAr = new ArrayList<> ();
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    for (int i=0;i<n;i++)
      ar.add(sc.nextInt());

    sc.close();
    int mx = n-1;
    int mn = 0;
    for (int i=0;i<n;i++) {
      if (i%2==0) {
        newAr.add(ar.get(mx));
        mx--;
      }
    else
    {
      newAr.add(ar.get(mn));
      mn++;
    }
  }

  for(int i=0;i<n;i++)
    System.out.print(newAr.get(i)+" ");
    }
}
