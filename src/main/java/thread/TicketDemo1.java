package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketDemo1 {

    private AtomicInteger num = new AtomicInteger(100);

    public static void main(String[] args) {
        TicketDemo1 td = new TicketDemo1();
        td.start();
    }

    private synchronized int addNum(int n) {
        num.set(n);
        return num.get();
    }

    private void start() {
        Ticket1 t = new Ticket1();//创建一个线程任务对象。

        //创建4个线程同时卖票
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    class Ticket1 implements Runnable {
        public void run() {
            synchronized(this) {
                while (true) {
                    int n = num.get();
                    if (n > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                        }
                        //输出卖票信息
                        System.out.println(Thread.currentThread().getName() + ".....sale...." + addNum(--n));
                    } else{
                        return ;
                    }
                }
            }
        }
    }
}  