package HW1.Task1.ThreadExtend;

public class ThreadTry {
    public static void main(String[] args) {
        new NewThread();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread is ended");
        }
    }
}
