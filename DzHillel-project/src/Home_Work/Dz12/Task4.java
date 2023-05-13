package Home_Work.Dz12;

import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws Exception {
        List<String> words = List.of("Alex", "Alex", "Stepan",
                "Donald", "Matvey", "Alexandr", "Oleg", "Anna", "Olga", "Irina");
        calcOccurance(words);
    }

    public static void calcOccurance(List<String> wordsList) throws Exception {
        if (wordsList.isEmpty() || wordsList.size() < 10 || wordsList.size() > 20) {
            throw new Exception("the number of elements in the sheet is either zero or does not require attention");
        }

        for (int i = 0; i < wordsList.size(); i++) {
            String targetWord = wordsList.get(i);
            List<String> subList = wordsList.subList(0, i);

            if (!subList.contains(targetWord)) {
                int count = Collections.frequency(wordsList, targetWord);
                System.out.println(targetWord + ":" + count);
            }

        }

    }

}
