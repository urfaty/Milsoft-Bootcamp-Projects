package thread;

public class MyLambdaTest {

    public static void main(String[] args) {

        /*
        Runnable runnable =  () ->  work();
        Thread thread = new Thread(runnable);
        thread.start();
        */

/*
        Thread thread = new Thread(() ->  work());
        thread.start();
*/

        new Thread(() ->  work()).start();


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
