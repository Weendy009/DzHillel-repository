package Home_Work.Dz10;

public class MyThread extends Thread {
    private final int[] array;

    public MyThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            double j = (double) i / 5;
            array[i] = (int) (array[i] * Math.sin(0.2f + j) * Math.cos(0.2f + j) * Math.cos(0.4f + (double) i / 2));
        }
    }

    public int[] getArray() {
        return array;
    }
}
