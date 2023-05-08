package Home_Work.Dz10;

public class MyThread implements Runnable {
    private int[] array;

    public MyThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public int[] getArray() {
        return array;
    }
}
