import java.util.Scanner;
 
public class Domino {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 0;
    int m = sc.nextInt();
    int n = sc.nextInt();
 
    result = (m * n) / 2;
 
    System.out.println(result);
    sc.close();
  }
}