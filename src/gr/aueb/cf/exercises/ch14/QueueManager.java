package gr.aueb.cf.exercises.ch14;

public class QueueManager {

    private static final int MAX_SIZE = 100;

    private int[] queue;

    private int front;
    private int rear;
    private int size;

    private static QueueManager instance;

    private QueueManager() {
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return item;
    }

    private static boolean isFull() {
        return getInstance().size == MAX_SIZE;
    }

    private static boolean isEmpty() {
        return getInstance().size == 0;
    }
}