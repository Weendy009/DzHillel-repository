package Home_Work.Dz12.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverterToList<T> {

    public List<T> toList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}