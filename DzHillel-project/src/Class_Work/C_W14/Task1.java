package Class_Work.C_W14;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isValidBrackets("(a[b](f[(g)(g)])wr324<3535>hjgu)"));
    }

    public static boolean isValidBrackets(String input) {
        input = input.replaceAll("[a-zA-Zа-яА-я0-9./?!@#$%^&*]", "");
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('>', '<');

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (Character c : input.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
