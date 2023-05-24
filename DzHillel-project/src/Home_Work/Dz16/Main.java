package Home_Work.Dz16;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1, 7};
        int[] array2 = {5, 2, 9, 1, 7};

        QuickSort.quickSort(array1);
        CocktailShakerSort.cocktailShakerSort(array2);

        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("=".repeat(20));

        for (int num : array2) {
            System.out.print(num + " ");
        }

    }
}
