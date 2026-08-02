import java.util.*;
 
public class BoyorGirl {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
 
    HashSet<Character> set = new HashSet<>();
 
    for (int i = 0; i < in.length(); i++) {
      set.add(in.charAt(i));
    }
 
    if (set.size() % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    }
 
    else {
      System.out.println("IGNORE HIM!");
    }
    sc.close();
 
  }
}