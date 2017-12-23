package thread;

import java.util.stream.IntStream;

public class TestWhile {
    public static void main(String[] args) {
        while (true) {
            try {
                handle();
                IntStream.of(new int[]{1,2,3,4})
                        .forEach(i -> {
                            try {
                                Thread.sleep(1*1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                System.out.println("123");
                throw new NullPointerException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void handle() {
        if(1==1) {
            return ;
        }
    }
}
