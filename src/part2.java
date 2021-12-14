/*
Ryan Chien
Period 4
Fall Final
part2
 */

import java.util.Random;

public class part2 {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // create matrix
        int[][] intArray = new int[4][5];
        // populate matrix
        for (int r = 0; r < intArray.length; r++) {
            for (int c = 0; c < intArray[0].length; c++) {
                intArray[r][c] = random.nextInt(50) + 1;
            }
        }
        // calculate average
        int total = 0;
        int count = 0;
        double average;
        for (int r = 0; r < intArray.length; r++) {
            for (int c = 0; c < intArray[0].length; c++) {
                total += intArray[r][c];
                count++;
            }
        }
        average = (double) total / (double) count;
        // print matrix
        for (int r = 0; r < intArray.length; r++) {
            for (int c = 0; c < intArray[0].length; c++) {
                System.out.print(intArray[r][c] + "\t");
            }
            System.out.print("\n");
        }
        // print average
        System.out.println("Average of 2D Array: " + average);
    }
}
