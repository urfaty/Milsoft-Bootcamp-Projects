package thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("Koşuyor ..... ");
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
