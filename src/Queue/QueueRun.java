package Queue;

/**
 * Created by jmobijoh on 11/3/17.
 */
public class QueueRun {

    public static void main(String[] args) {
        QueueLinkedListImpl queueLinkedList = new QueueLinkedListImpl("1");
        queueLinkedList.enqueue("2");
        queueLinkedList.enqueue("3");
        queueLinkedList.enqueue("4");
        queueLinkedList.enqueue("5");
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
    }
}
