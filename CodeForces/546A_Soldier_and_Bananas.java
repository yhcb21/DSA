import java.util.Scanner;
 
public class SoldierBanana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int money = 0;
    int cost = 0;
    // int cost = w * k;
 
    for (int i = 1; i <= w; i++) {
      cost = (i * k) + cost;
    }
 
    if (cost > n) {
      money = cost - n;
    }
 
    System.out.println(money);
  }
}