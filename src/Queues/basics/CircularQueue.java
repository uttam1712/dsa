package Queues.basics;

class MyCircularQueue {
    public int[] arr;
    public int f, r;
    public int size;

    MyCircularQueue(int size) {
        this.size = size;
        f = -1;
        r = -1;
        arr = new int[size];
    }

    public void enqueue(int d) {
        // if queue full

        if(isFull()) {
            System.out.println("Queue is full, can't insert");
        }

        // if queue empty
        else if(isEmpty()) {
            f = r = 0;
            arr[r] = d;
        }

        // normal case
        else {
            if(r == size-1) {
                r = 0;
                arr[r] = d;
            }
            else arr[++r] = d;
        }
    }

    public int dequeue() {
        // if queue if empty
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        // queue contains only one element
        else if(f == r) {
            int val = arr[f];
            f = r = -1;
            return val;
        }

        // normal case
        else {
            f++;
            if(f == size) f = 0;
            return arr[f];
        }
    }

    public int peek() {
        // if queue empty
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        return arr[f];
    }

    public void printQueue() {

        System.out.println("front : " + f + ", rear : " + r);

        // if f < r
        if(f <= r) {
            for(int i = f ; i<=r ; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // if r < f
        else {
            for(int i = f ; i<size ; i++) {
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i <=r; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

    public boolean isEmpty() {
        return f == -1 && r == -1;
    }

    public boolean isFull() {
        if((f == 0 && r == size-1) || (r == f-1)) return true;
        else return false;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue(5);

        cq.enqueue(1);
        cq.printQueue();
        cq.enqueue(2);
        cq.printQueue();
        cq.enqueue(3);
        cq.printQueue();
        cq.enqueue(4);
        cq.printQueue();
        cq.enqueue(5);
        cq.printQueue();
        cq.enqueue(6);
        cq.printQueue();
        cq.dequeue();
        cq.printQueue();
        cq.dequeue();
        cq.printQueue();
        cq.dequeue();
        cq.printQueue();
        cq.enqueue(6);
        cq.printQueue();
        cq.enqueue(7);
        cq.printQueue();
    }
}
