package lab_Ten;

import java.util.*;

public class RandomNumberArray {
    private int[] randomNumbers;

    public RandomNumberArray() {
        randomNumbers = new int[50];
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            randomNumbers[i] = rand.nextInt(500) + 1;
        }
    }

    public void displayOriginalValues() {
        for (int i = 0; i < 50; i++) {
            System.out.print(randomNumbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public int getMaxValue() {
        int maxValue = randomNumbers[0];
        for (int i = 1; i < 50; i++) {
            if (randomNumbers[i] > maxValue) {
                maxValue = randomNumbers[i];
            }
        }
        return maxValue;
    }

    public int getMinValue() {
        int minValue = randomNumbers[0];
        for (int i = 1; i < 50; i++) {
            if (randomNumbers[i] < minValue) {
                minValue = randomNumbers[i];
            }
        }
        return minValue;
    }

    public int getNthValue(int n) {
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("Invalid value of n. n should be between 1 and 50.");
        }
        return randomNumbers[n - 1];
    }

    public int getNthSmallest(int n) {
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("Invalid value of n. n should be between 1 and 50.");
        }
        int[] copy = Arrays.copyOf(randomNumbers, 50);
        Arrays.sort(copy);
        return copy[n - 1];
    }

    public int countOddValues() {
        int count = 0;
        for (int i = 0; i < 50; i++) {
            if (randomNumbers[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < 50; i++) {
            total += randomNumbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        RandomNumberArray array = new RandomNumberArray();

        // Display original values
        System.out.println("Original values:");
        array.displayOriginalValues();
        System.out.println();

        // Max value
        int maxValue = array.getMaxValue();
        System.out.println("Max value: " + maxValue);

        // Min value
        int minValue = array.getMinValue();
        System.out.println("Min value: " + minValue);

        // Display 10th, 20th, and 30th data
        System.out.println("10th data: " + array.getNthValue(10));
        System.out.println("20th data: " + array.getNthValue(20));
        System.out.println("30th data: " + array.getNthValue(30));

        // Nth smallest value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth smallest value: ");
        int n = scanner.nextInt();
        int nthSmallest = array.getNthSmallest(n);
        System.out.println("The " + n + "th smallest value: " + nthSmallest);
        		
        		
    }
    
}
