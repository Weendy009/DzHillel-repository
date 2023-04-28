package Home_Work.Dz7.classes;
import Home_Work.Dz7.exceptions.ArrayDataException;
import Home_Work.Dz7.exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        int sum;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySizeException("Wrong array size.");
        }
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new ArrayDataException("Invalid data at index array[" +i+ "][" +j+ "]");
                }
            }
        }
        return sum;
    }
}
