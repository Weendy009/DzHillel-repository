package Home_Work.Dz12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("Donald " + i);
        }

        System.out.println(countOccurance(list, "Donald 3"));

    }

    public static int countOccurance(List<String> input, String desired) throws Exception {
        int result = 0;

        if (input.isEmpty() || input.size() < 10) {
            throw new Exception("input list is empty or less than 10 elements.");
        }

        for (String s : input) {
            if (s.equals(desired)) {
                result++;
            }
        }

        return result;
    }

}
