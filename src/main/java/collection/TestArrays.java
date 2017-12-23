package collection;

import java.util.Arrays;

public class TestArrays {
    
    public static void main(String[] args) {
        testSort();
    }
    
    public static final void testSort() {
        int[] a = new int[]{3,5,2,6};
        Arrays.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
    
}
