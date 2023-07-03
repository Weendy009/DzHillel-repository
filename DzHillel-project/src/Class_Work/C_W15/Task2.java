package Class_Work.C_W15;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};

        System.out.println(differenceOfSum(nums));
    }
    public static int sumOfMultiples(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                result += i;
            }
        }

        return result;
    }

    public static int differenceOfSum(int[] nums) {
        int elements = 0;
        int numbers = 0;

        for (int i : nums) {
            if (i <= 10) {
                numbers += i;
            } else {
                elements += i;
            }
        }

        return elements - numbers;
    }

}
