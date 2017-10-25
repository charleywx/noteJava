package se.base;

public class IntArr {
    
    
    public static void main(String[] args) {
        testInteger();
    }
    
    /**
     * 两种方式一样
     */
    public static void testInt() {
        // int[] arr = new int[8];
        int[] arr = new int[]{0,0,0,0,0,0,0,0};
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    /**
     * 报错 new Integer[8] 对象为空
     */
    public static void testInteger() {
        Integer[] arr = new Integer[8];
        //Integer[] arr = new Integer[]{0,0,0,0,0,0,0,0};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
