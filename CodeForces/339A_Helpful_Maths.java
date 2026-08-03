import java.util.*;
import java.util.Arrays;
 
public class HelpfulMaths {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
 
    String[] nums = in.split("\\+");
    Arrays.sort(nums);
 
    String word = String.join("+", nums);
 
    System.out.println(word);
    sc.close();
 
  }
}