package Class_Work.C_W17;


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrray = {0,1,0,3,12};
        moveZeroes(arrray);
    }

    public static void moveZeroes(int[] nums) {
        int target = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[target];
                nums[target] = 0;
                target -= 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
