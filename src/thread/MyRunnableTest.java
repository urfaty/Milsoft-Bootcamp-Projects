package thread;

public class MyRunnableTest {


    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        while (true) {
            System.out.println("Sürüyor ..... ");
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
