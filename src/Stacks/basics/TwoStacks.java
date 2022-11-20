package Stacks.basics;

public class TwoStacks {
    public int[] arr;
    public int top1;
    public int top2;
    public int size;

    TwoStacks(int size) {
        this.size = size;
        this.arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int d) {
        if(top2-top1 > 1) {
            ++top1;
            arr[top1] = d;
        }
        else {
            System.out.println("Stack 1 Overflow");
        }
    }

    public void push2(int d) {
        if(top2-top1 > 1) {
            --top2;
            arr[top2] = d;
        }
        else {
            System.out.println("Stack 2 Overflow");
        }
    }

    public int pop1() {
        if(top1<0) {
            System.out.println("Stack 1 Underflow");
            return Integer.MIN_VALUE;
        }

        return arr[top1--];
    }

    public int pop2() {
        if(top2>=size) {
            System.out.println("Stack 2 Underflow");
            return Integer.MIN_VALUE;
        }

        return arr[top2++];
    }

    public int peek1() {
        if(top1 == -1) {
            System.out.println("Stack 1 is empty");
            return Integer.MIN_VALUE;
        }

        return arr[top1];
    }

    public int peek2() {
        if(top2 == size) {
            System.out.println("Stack 2 is empty");
            return Integer.MIN_VALUE;
        }

        return arr[top2];
    }
}


