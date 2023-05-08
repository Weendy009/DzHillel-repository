package Class_Work.C_W11;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println(thread.isInterrupted());
        thread.setDaemon(true);
        thread.start();
    }

}
