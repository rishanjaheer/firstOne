import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.toLowerCase();
        System.out.println(capitalize(s));

    }

    public static String capitalize(String word) {
        char[] arr  = word.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }
}
