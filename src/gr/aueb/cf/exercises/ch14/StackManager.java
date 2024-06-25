package gr.aueb.cf.exercises.ch14;

public class StackManager {

    private static final int MAX_SIZE = 100;
    private String[] stack;
    private int top;
    private static StackManager instance;

    private StackManager() {
        stack = new String[MAX_SIZE];
        top = -1; // Το stack είναι άδειο στην αρχή
    }

    public static synchronized StackManager getInstance() {
        if (instance == null) {
            instance = new StackManager();
        }
        return instance;
    }

    public void push(String item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = item;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    private static boolean isFull() {
        return instance.top == MAX_SIZE - 1;
    }

    private static boolean isEmpty() {
        return instance.top == -1;
    }
}