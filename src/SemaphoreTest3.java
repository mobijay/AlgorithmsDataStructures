/**
 * Created by jmobijoh on 10/19/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class SemaphoreTest3 {

    private Map<Integer, Semaphore> m = new HashMap<>();
    private Semaphore operationSemaphore = new Semaphore(1);

    public void enqueue(int id) {
        Semaphore s;

        // Need to protect check if semaphore exists
        synchronized (m) {
            System.out.println("Queue id: " + id);
            s = m.get(id);
            if (s == null) {
                s = new Semaphore(5);
                m.put(id, s);
            }
        }

        if (!s.tryAcquire()) {
            System.out.println("Cannot acquire Permit");
        }
        System.out.println("Queue Available Permits " + s.availablePermits() + " id: " +id);
    }

    public void dequeue(int id) {
        // simplified, should check for existence and do cleanup.
        m.get(id).release();
    }

    public void doOperation(int id) {
        enqueue(id);

        try {
            operationSemaphore.acquire();
            System.out.println("ID " + id + " lock Acquired Available Permits " + operationSemaphore.availablePermits());
        } catch (InterruptedException e) {
            // An internal exception?
            throw new RuntimeException();
        }

        // do operation here ...
        System.out.println("operation for " + id);
        try {
            System.out.println("Sleep");
            Thread.sleep(50000000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } finally {
            dequeue(id);
            operationSemaphore.release();
            System.out.println("ID " + id + " Lock Released. Available Permits: " + operationSemaphore.availablePermits());
        }
    }

    public static void main(String[] args) {
        SemaphoreTest3 tq = new SemaphoreTest3();

        Thread t1 = new Thread(() -> tq.doOperation(1));
        t1.start();

        Thread t2 = new Thread(() -> tq.doOperation(1));
        t2.start();

        Thread t3 = new Thread(() -> tq.doOperation(1));
        t3.start();

        Thread t4 = new Thread(() -> tq.doOperation(1));
        t4.start();

        Thread t5 = new Thread(() -> tq.doOperation(1));
        t5.start();

        Thread t6 = new Thread(() -> tq.doOperation(1));
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
