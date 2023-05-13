package Home_Work.Dz12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws Exception {
        List<String> words = List.of("Alex", "Alex", "Stepan",
                "Donald", "Matvey", "Alexandr", "Oleg", "Anna", "Donald", "Irina");
        List[] lists = findOccurance(words);
        List<String> names = lists[0];
        List<String> counter = lists[1];

        System.out.println(names);
        System.out.println(counter);

    }

    public static List[] findOccurance(List<String> words) throws Exception {
        List<Integer> counter = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List[] result = new List[2];

        if (words.isEmpty() || words.size() < 10 || words.size() > 20) {
            throw new Exception("the number of elements in the sheet is either zero or does not require attention");
        }

        for (int i = 0; i < words.size(); i++) {
            String targetWord = words.get(i);
            List<String> subList = words.subList(0, i);

            if (!subList.contains(targetWord)) {
                int count = Collections.frequency(words, targetWord);
                names.add(targetWord);
                counter.add(count);
                System.out.println("name: " + targetWord + ", occurrence: " + count);
            }
        }

        result[0] = names;
        result[1] = counter;

        return result;
    }

}
