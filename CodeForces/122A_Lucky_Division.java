import java.util.Scanner;
 
public class LuckyDivision {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int n = sc.nextInt();
 
    for (int i = 1; i <= n; i++) {
 
      int x = i;
      boolean lucky = true;
 
      while (x > 0) {
        int digit = x % 10;
 
        if (digit != 4 && digit != 7) {
          lucky = false;
          break;
        }
 
        x /= 10;
      }
 
      if (lucky && n % i == 0) {
        System.out.println("YES");
        return;
      }
    }
 
    System.out.println("NO");
  }
}