package Class_Work.C_W25.main;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringToSetConverter {
    public static String toString(Set<Integer> numbers) {
        /**
         *
         * 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
         * [1][2][3][4][5][6][7][8][9][0]
         *
         *
        **/

        if (numbers == null || numbers.isEmpty()) {
            return null;
        }

        return numbers.stream()
                .map(number -> "[" + number + "]")
                .collect(Collectors.joining());

    }

    public static Set<Integer> toSet(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        String[] parts = value.split("]");
        Set<Integer> numbers = new HashSet<>();

        for (String part : parts) {
            part.replace("[", "");
            numbers.add(Integer.parseInt(part));
        }
        return numbers;
    }

}
