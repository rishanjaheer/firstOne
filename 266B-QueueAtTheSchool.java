import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =  scan.nextInt();
        int t =  scan.nextInt();
        String s = scan.next();
        char[] students = s.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (students[j] == 'B' && students[j+1] == 'G') {
                    students[j] = 'G';
                    students[j+1] = 'B';
                    j++;
                }
            }
        }

        for (char student : students) {
            System.out.print(student);
        }
    }
}
