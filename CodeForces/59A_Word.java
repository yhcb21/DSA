import java.util.Scanner;
 
public class Word {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    int upper = 0;
    int lower = 0;
 
    char[] cord = word.toCharArray();
 
    for (char c : cord) {
      if (Character.isUpperCase(c)) {
        upper++;
      } else {
        lower++;
        ;
      }
    }
 
    String neww;
    if (upper > lower) {
      neww = word.toUpperCase();
    } else {
      neww = word.toLowerCase();
    }
 
    System.out.println(neww);
  }
}