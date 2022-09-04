import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String s[] = sc.nextLine().split(" ");
    System.out.println("Enter a word to search for: ");
    String wo = sc.next();
    int count = 0;

    for (String w:s) {
      if (w.contains(wo))
        count++;
    }
    if (count > 0)
      System.out.println(count);
    else
      System.out.println("-1");
  }
}
