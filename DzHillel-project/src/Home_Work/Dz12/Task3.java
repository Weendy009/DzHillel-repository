package Home_Work.Dz12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 1, 1, 2, 4, 5, 6, 7, 1);
        System.out.println(findUnique(list));
    }
    public static List<Integer> findUnique(List<Integer> inputList) {
        Set<Integer> setUnique = new HashSet<>(inputList);
        return setUnique.stream().toList();
    }
}
