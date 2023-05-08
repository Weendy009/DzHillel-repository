package Home_Work.Dz11.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverterToList<T> {

    public List<T> toList(T[] array) {
        List<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }

}