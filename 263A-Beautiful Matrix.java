import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[][] nums = new int[5][5];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = s.nextInt();
                
            }
        }
        
        int rowIndex = 0;
        int colIndex = 0;
        while (rowIndex == 0 && colIndex == 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (nums[i][j] == 1) {
                        rowIndex = i + 1;
                        colIndex = j + 1;
                    }
                }
                
            }
        }
        
        int minNumber = Math.abs(3 - rowIndex) + Math.abs(3 - colIndex);
        System.out.println(minNumber);
        
    }
}
