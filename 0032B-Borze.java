import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.next();
        char[] numChar = num.toCharArray();
        ArrayList<Integer> dc = new ArrayList<>();

        for (int i = 0; i < numChar.length; i++) {
            if (numChar[i] == '.') {
                dc.add(0);
            } else if (numChar[i] == '-' && numChar[i + 1] == '.') {
                dc.add(1);
                i++;
            } else {
                dc.add(2);
                i++;
            }
        }

        for (int i = 0; i < dc.size(); i++) {
            System.out.print(dc.get(i));
        }

    }
}
