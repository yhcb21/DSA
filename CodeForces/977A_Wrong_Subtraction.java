import java.util.Scanner;
 
public class WrongSubtraction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n = sc.nextInt();
 
    for (int i = 1; i <= n; i++) {
      if (num % 10 == 0) {
        num = num / 10;
      } else {
        num--;
      }
    }
 
    System.out.println(num);
  }
}