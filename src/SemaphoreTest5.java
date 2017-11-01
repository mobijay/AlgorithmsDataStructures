/**
 * Created by jmobijoh on 10/19/17.
 */

import java.util.concurrent.Semaphore;

public class SemaphoreTest5 {

    private Semaphore operationSemaphore = new Semaphore(5);

    public synchronized void enqueue(int id) {

        if(operationSemaphore.tryAcquire()) {
            System.out.println("ID: " + id + " Permit Acquired");
        } else {
            throw new RuntimeException();
        }
    }

    public void dequeue(int id) {
        // simplified, should check for existence and do cleanup.
        operationSemaphore.release();
        System.out.println("ID " + id + " Lock Released. Available Permits: " + operationSemaphore.availablePermits());
    }

    public void doOperation(int id) {
        enqueue(id);
        try {
            // do operation here ...
            methodCall(id);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } finally {
            dequeue(id);
        }
    }

    public void methodCall(int id) throws InterruptedException {
        //CDN Prefix API Purge call
        System.out.println("operation for " + id);
        Thread.sleep(10000);
    }

    public static void main(String[] args) {
        SemaphoreTest5 tq = new SemaphoreTest5();

        Thread t1 = new Thread(() -> tq.doOperation(1));
        t1.start();

        Thread t2 = new Thread(() -> tq.doOperation(2));
        t2.start();

        Thread t3 = new Thread(() -> tq.doOperation(3));
        t3.start();

        Thread t4 = new Thread(() -> tq.doOperation(4));
        t4.start();

        Thread t5 = new Thread(() -> tq.doOperation(5));
        t5.start();

        Thread t6 = new Thread(() -> tq.doOperation(6));
        t6.start();

        Thread t7 = new Thread(() -> tq.doOperation(7));
        t7.start();

        Thread t8 = new Thread(() -> tq.doOperation(8));
        t8.start();

        Thread t9 = new Thread(() -> tq.doOperation(9));
        t9.start();

        Thread t10 = new Thread(() -> tq.doOperation(10));
        t10.start();

        Thread t11 = new Thread(() -> tq.doOperation(11));
        t11.start();

        Thread t12 = new Thread(() -> tq.doOperation(12));
        t12.start();
    }
}
