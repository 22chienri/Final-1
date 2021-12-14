/*
Ryan Chien
Period 4
Fall Final
part1
 */

import java.util.Random;

public class part1 {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // create array
        int[] numArray = new int[10];
        // populate array
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = random.nextInt(30) + 1;
        }
        // count even
        int evens = 0;
        for (int num : numArray) {
            if (num % 2 == 0) {
                evens++;
            }
        }
        // print array
        int j = 0;
        while (j < numArray.length) {
            System.out.print(numArray[j] + " ");
            j++;
        }
        System.out.println("\nEven numbers: " + evens);
    }
}
