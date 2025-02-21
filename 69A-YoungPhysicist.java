import java.util.Scanner;
 
public class Problem69A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int x = 0, y = 0, z = 0;
        
        while (n-- >= 1) {
            x = x + scan.nextInt();
            y = y + scan.nextInt();
            z = z + scan.nextInt();
        }
        
        if (x==0 && y==0 && z==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
