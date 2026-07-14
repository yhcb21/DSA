import java.util.Scanner;
 
public class New {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int wt = sc.nextInt();
        
        if (wt % 2 == 0 && wt > 2) {
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
        
    }
}