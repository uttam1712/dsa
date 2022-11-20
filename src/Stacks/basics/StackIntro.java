package Stacks.basics;

class MyStack {
    public int[] arr;
    public int top;
    public int size;

    MyStack(int n) {
        this.size = n;
        this.arr = new int[size];
        top = -1;
    }

    public void push(int d) {
        if(top>=this.size) {
            System.out.println("Stack overflow");
            return;
        }

        ++top;
        arr[top] = d;
    }

    public int pop() {
        if(top<0) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }

        return arr[top--];
    }

    public int peek() {
        if(this.isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        return arr[top];
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }
}

public class StackIntro {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
