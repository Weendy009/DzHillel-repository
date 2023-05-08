package Home_Work.Dz11.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConverterToList<Integer> converterToList = new ConverterToList<>();
        Integer[] array = {1,2,3,4,5,6,7};
        List<Integer> intList = converterToList.toList(array);
        System.out.println(intList);
    }
}
