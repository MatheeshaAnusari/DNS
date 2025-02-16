class BoundedQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public BoundedQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public static void main(String[] args) {
        BoundedQueue queue = new BoundedQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
    }
}
