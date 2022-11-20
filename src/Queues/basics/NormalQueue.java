package Queues.basics;

class MyQueue {
    public int[] arr;
    public int f, r;
    public int size;

    MyQueue(int size) {
        this.size = size;
        f = -1;
        r = -1;
        arr = new int[size];
    }

    public void enqueue(int d) {
        // if queue full

        if(f == 0 && r == size-1) {
            System.out.println("Queue is full, can't insert");
        }

        // if queue empty
        else if(isEmpty()) {
            f = r = 0;
            arr[r] = d;
        }

        // normal case
        else arr[++r] = d;
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
            return arr[f++];
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
        for(int i = f ; i<=r ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return f == -1 && r == -1;
    }

}

public class NormalQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.enqueue(1);
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.enqueue(2);
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.enqueue(3);
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.enqueue(4);
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.enqueue(5);
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.enqueue(6);
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.dequeue();
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
        q.dequeue();
        System.out.println("front : " + q.f + ", rear : " + q.r);
        q.printQueue();
    }
}
