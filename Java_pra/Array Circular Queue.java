class ArrayCircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
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

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayCircularQueue queue = new ArrayCircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
