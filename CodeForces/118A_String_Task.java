import java.util.Scanner;
 
public class StringTask {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    String word = sc.next();
    char[] characters = word.toCharArray();
    StringBuilder result = new StringBuilder();
    String vowels = "aeiouy";
    for (char c : characters) {
      char lower = Character.toLowerCase(c);
      if (vowels.indexOf(lower) == -1) {
        result = result.append("." + lower);
      }
    }
 
    System.out.println(result);
 
  }
}