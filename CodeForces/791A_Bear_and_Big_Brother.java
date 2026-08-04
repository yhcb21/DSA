import java.util.Scanner;
 
public class BearandBigBrother {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int limak = sc.nextInt();
    int bob = sc.nextInt();
    int years = 0;
    while (bob >= limak) {
      bob *= 2;
      limak *= 3;
      years++;
    }
 
    System.out.println(years);
  }
}