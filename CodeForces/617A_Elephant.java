import java.util.Scanner;
 
public class Elephant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();
 
    if (in == 0) {
      System.out.println("0");
    }
 
    int num = in / 5;
    int steps = num;
 
    if (in % 5 != 0) {
      steps = num + 1;
    }
 
    System.out.println(steps);
 
  }
}