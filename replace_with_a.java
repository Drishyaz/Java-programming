import java.util.*;
public class repalce_with_a {
    public static void main(String[] args) {
        try{	
            Scanner sc = new Scanner(System.in);
            String s1="NPTELJAVA"; 
          /*for taking custom input of string
            String s1 = "";
            s1 = sc.nextLine();*/
        
            int n = sc.nextInt();
            char c = 'a';
            sc.close();

            System.out.print(s1.replace(s1.charAt(n),c));
        }

        catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
