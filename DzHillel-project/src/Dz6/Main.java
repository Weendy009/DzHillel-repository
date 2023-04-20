package Dz6;

import javax.print.DocFlavor;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Matvey", 't'));
        System.out.println(findWordPosition("Matvey", "vey"));
        System.out.println(stringReverse("Matvey"));
        System.out.println(isPalindrome("мадам"));
        // game();
        gameOne();
    }

    public static int findSymbolOccurance(String string, char value) {
        int result = 0;
        for (char c : string.toCharArray()) {
            if (c == value) {
                result += 1;
            }
        }
        return result;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static boolean isPalindrome(String input) {
        StringBuilder stringBuilder;
        input = input.replaceAll("[0-9,./:;?!@#$%^&*()\\[\\]{}]", "");
        input = input.toLowerCase();
        stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(input);
    }

    public static void game() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        String result = words[random.nextInt(words.length - 1)];
        String input;
        int countChar = 0;
        final int countIter = 15;

        while (true) {
            System.out.println("Enter a word: ");
            input = scr.nextLine();
            if (result.equals(input)) {
                System.out.println("WIN");
                break;
            } else {
                System.out.print("result: ");
                for (int i = 0; i <= countChar; i++) {
                    if (!(i >= result.length())) {
                        System.out.print(result.charAt(i));
                    }
                }
                if (!(countIter <= countChar)) {
                    System.out.print("#".repeat(countIter - countChar) + "\n");
                } else {
                    System.out.println("\nLOSE");
                    break;
                }
                countChar += 1;
            }
        }
    }

    public static void gameOne() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        String resultString = words[random.nextInt(words.length - 1)];
        char[] inputChars = new char[resultString.length()];
        String input;
        final int COUNT_ITER = 15;

        System.out.println(resultString);

        while (true) {
            System.out.println("Enter a word: ");
            input = scr.nextLine();
            if (input.equals(resultString)) {
                System.out.println("WIN");
                break;
            } else {
                for (int i = 0; i < input.length(); i++) {
                    int i1 = resultString.indexOf(input.charAt(i));
                    if (i1 != -1) {
                        inputChars[i1] = input.charAt(i);
                    }
                }
            }
            for (char c : inputChars) {
                System.out.print(c);
            }
            System.out.print("#".repeat(COUNT_ITER - inputChars.length) + "\n");
        }
    }

}
