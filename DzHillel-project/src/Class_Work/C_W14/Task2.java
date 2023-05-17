package Class_Work.C_W14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        int[] array2 = {1,2,3,4};
        boolean result = containsDuplicate(array);
        System.out.println("containsDuplicate: " + result);

    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> integers = Arrays.stream(nums).boxed().toList();

        for (int i : nums) {
            int frequency = Collections.frequency(integers, i);
            if (frequency == 2) {
                return true;
            } else {
                continue;
            }
        }

        return false;
    }

}
