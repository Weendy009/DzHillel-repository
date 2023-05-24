package Home_Work.Dz16;

public class CocktailShakerSort {
    public static void cocktailShakerSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}