class Foo {
    public boolean firstPrinted;
    public boolean secondPrinted;

    public Foo() {
        firstPrinted = false;
        secondPrinted = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstPrinted = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!firstPrinted) {
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondPrinted = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!secondPrinted) {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}


import java.util.concurrent.*;

class Foo {
    public Semaphore r2;
    public Semaphore r3;
    
    public Foo() {
        r2 = new Semaphore(0);
        r3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        r2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        r2.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        r3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        r3.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}