package thread;

public class MyThread extends Thread{

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
