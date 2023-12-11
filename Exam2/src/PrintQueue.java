public class PrintQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public PrintQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(String printTask) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = printTask;
        size++;
        System.out.println(printTask + " enqueued to the print queue.");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        String printTask = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(printTask + " dequeued from the print queue.");
        return printTask;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return queue[front];
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Print queue cleared.");
    }

    private boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        PrintQueue printerQueue = new PrintQueue(5);

        printerQueue.enqueue("Print Task 1");
        printerQueue.enqueue("Print Task 2");
        printerQueue.enqueue("Print Task 3");

        System.out.println("Is the queue empty? " + printerQueue.isEmpty());
        System.out.println("Front task: " + printerQueue.peek());

        printerQueue.dequeue();
        printerQueue.dequeue();

        System.out.println("Is the queue empty? " + printerQueue.isEmpty());

        printerQueue.clear();
        System.out.println("Is the queue empty after clearing? " + printerQueue.isEmpty());
    }
}


	