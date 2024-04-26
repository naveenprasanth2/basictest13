package org.example.multithreading;

class Q {
    int num;
    private boolean valueSet = false;

    public void setNum(int num) {
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.num = num;
    }

    public int getNum(){
        if(valueSet){
            notify();
        }
        return this.num;
    }
}

class Producer implements Runnable {
    private final Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(STR."Set val is \{i}");
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {

    private final Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(STR."Get val is : \{q.getNum()}");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}