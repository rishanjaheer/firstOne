import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();

        int lucky = 0;



        char[] digits = n.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '4' || digits[i] == '7') {
                lucky++;
            }
        }
        if (lucky == 4 || lucky == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
