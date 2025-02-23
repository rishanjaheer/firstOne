import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 0;




        for (int i = n + 1; i < 100000; i++) {
            char[] inChar = (Integer.toString(i)).toCharArray();
            if (inChar[0] != inChar[1] && inChar[1] != inChar[2] && inChar[2] != inChar[3] && inChar[0] != inChar[2] && inChar[0] != inChar[3] && inChar[1] != inChar[3]) {
                for (char c : inChar) {
                    System.out.print(c);
                }
                break;
            }


        }



    }
}
