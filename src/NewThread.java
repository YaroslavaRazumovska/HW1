public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Thread");
        t.start();
    }
    public void run() {
        try {
            while(true) {
                System.out.println(t.getName());
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
    }
}
