package Home_Work.Dz21.main;

import Home_Work.Dz21.classes.tests.TestRunner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.runTests();

        System.out.println("=".repeat(10) + "14" + "=".repeat(10));
        int[] inputArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] resultArray = extractElementsAfterLastFour(inputArray);
        System.out.println(Arrays.toString(resultArray));

        System.out.println("=".repeat(10) + "15" + "=".repeat(10));
        int[] array1 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] array2 = {1, 1, 1, 1, 1, 1};
        int[] array3 = {4, 4, 4, 4};
        int[] array4 = {1, 4, 4, 1, 1, 4, 3};

        System.out.println(checkArrayComposition(array1));
        System.out.println(checkArrayComposition(array2));
        System.out.println(checkArrayComposition(array3));
        System.out.println(checkArrayComposition(array4));
    }
    public static int[] extractElementsAfterLastFour(int[] inputArray) {
        int index = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 4) {
                index = i;
            }
        }

        if (index == -1) {
            throw new RuntimeException("Array does not contain the number 4.");
        }

        int[] resultArray = new int[inputArray.length - index - 1];
        System.arraycopy(inputArray, index + 1, resultArray, 0, resultArray.length);
        return resultArray;
    }

    public static boolean checkArrayComposition(int[] array) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int value : array) {
            if (value == 1) {
                hasOne = true;
            } else if (value == 4) {
                hasFour = true;
            }
        }

        return hasOne && hasFour;
    }
}
