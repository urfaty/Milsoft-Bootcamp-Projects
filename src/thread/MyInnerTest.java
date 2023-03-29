package thread;

public class MyInnerTest {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                work();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        execute();

    }


    private static  void execute () {
        while (true) {
            System.out.println("Sürüyor ..... ");
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void work() {
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
