package HW1.Task1.ThreadExtend;

public class NewThread extends Thread {
    NewThread() {
        start();
    }
    public void run() {
            try {
                while(true) {
                    System.out.println(getName());
                    Thread.sleep(5000);//
                }
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
    }

