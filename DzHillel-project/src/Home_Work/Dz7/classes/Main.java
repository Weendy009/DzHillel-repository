package Home_Work.Dz7.classes;

import Home_Work.Dz7.exceptions.ArrayDataException;
import Home_Work.Dz7.exceptions.ArraySizeException;

public class Main {

    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        }; // 136
        ArrayValueCalculator list = new ArrayValueCalculator();

        System.out.println(list.doCalc(array));
    }
}