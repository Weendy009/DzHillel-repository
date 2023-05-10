package Home_Work.Dz10;

import java.util.Arrays;

public class ValueCalculator {
    private int[] array;
    private long arraySize;
    private int arrayHalfLength;


    public long timeStampAlgorithm(long size) throws InterruptedException {
        long start = System.currentTimeMillis();
        MyThread threadOne;
        MyThread threadTwo;
        int[] arrayOne;
        int[] arrayTwo;

        if (size < 1_000_000) {
            return -1;
        }

        arraySize =  size;
        arrayHalfLength = (int) arraySize / 2;
        array = new int[(int) arraySize];

        Arrays.fill(array, 7);
        arrayOne = new int[arrayHalfLength];
        arrayTwo = new int[arrayHalfLength];

        System.arraycopy(array, 0, arrayOne, 0, arrayHalfLength);
        System.arraycopy(array, arrayHalfLength, arrayTwo, 0, arrayHalfLength);

        threadOne = new MyThread(arrayOne);
        threadTwo = new MyThread(arrayTwo);
        threadOne.start();
        threadTwo.start();

        arrayOne = threadOne.getArray();
        arrayTwo = threadTwo.getArray();

        System.arraycopy(arrayOne, 0, array, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, array, arrayOne.length, arrayTwo.length);

        return System.currentTimeMillis() - start;
    }

}
