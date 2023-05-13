package Home_Work.Dz12.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConverterToList<Integer> integerConverterToList =
        new ConverterToList<>();

        Integer[] arr = {1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9, 10};
        List<Integer> result = integerConverterToList.toList(arr);

        System.out.println(result);
    }
}
