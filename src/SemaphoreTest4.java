/**
 * Created by jmobijoh on 10/19/17.
 */

import java.util.concurrent.Semaphore;

public class SemaphoreTest4 {

    private Semaphore operationSemaphore = new Semaphore(5);

    public void enqueue(int id) {

        if(operationSemaphore.availablePermits() == 0) {
            throw new RuntimeException();
        }

        try {
            operationSemaphore.acquire();
            System.out.println("ID: " + id + " Permit Acquired");
        } catch(InterruptedException e) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void dequeue() {
        // simplified, should check for existence and do cleanup.
        operationSemaphore.release();
    }

    public void doOperation(int id) {
        enqueue(id);
        try {
            // do operation here ...
            methodCall(id);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } finally {
            dequeue();
            System.out.println("ID " + id + " Lock Released. Available Permits: " + operationSemaphore.availablePermits());
        }
    }

    public synchronized void methodCall(int id) throws InterruptedException {
        System.out.println("operation for " + id);
        Thread.sleep(10000);
    }

    public static void main(String[] args) {
        SemaphoreTest4 tq = new SemaphoreTest4();

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
