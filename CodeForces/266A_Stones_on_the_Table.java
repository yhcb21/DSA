import java.util.Scanner;
 
public class StonesonTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stones = sc.nextInt();
    String in = sc.next();
    int count = 0;
 
    for (int i = 0; i < stones - 1; i++) {
      if (in.charAt(i) == in.charAt(i + 1)) {
        count++;
      }
    }
 
    System.out.println(count);
  }
}