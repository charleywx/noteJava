package se.base;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 */
public class TestComparator {
    
    @Test
    public void testOrdering(){
        List<String> list = new ArrayList();
        list.add("peida");
        list.add("jerry");
        list.add("harry");
        list.add("eva");
        list.add("jhon");
        list.add("neron");
        
        System.out.println("list:"+ list);
        
        List<Integer> listtest= new ArrayList();
        listtest.add(1);
        listtest.add(1);
        listtest.add(1);
        listtest.add(2);

        System.out.println("listtest:"+ listtest);
    }

}