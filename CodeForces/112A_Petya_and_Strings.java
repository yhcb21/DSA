import java.util.Scanner;
 
public class PetyaAndString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
 
    String strl1 = str1.toLowerCase();
    String strl2 = str2.toLowerCase();
 
    for (int i = 0; i < strl1.length(); i++) {
      if (strl1.charAt(i) > strl2.charAt(i)) {
        System.out.println("1");
        return;
      }
 
      if (strl1.charAt(i) < strl2.charAt(i)) {
        System.out.println("-1");
        return;
      }
    }
 
    System.out.println("0");
 
    sc.close();
  }
}