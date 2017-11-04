package se.base;

import bean.ClassA;
import bean.ClassB;
import bean.OneInterface;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 一般用于Class<T>，对于未知类的实例化
 */
public class NewInstance {

    @Test
    public void test() {
        Set<Class<?>> set = new LinkedHashSet();
//        ClassA classA = new ClassA();
//        ClassB classB = new ClassB();
//        set.add(classA.getClass());
//        set.add(classB.getClass());

        // 此时并未实例化
        set.add(ClassA.class);
        set.add(ClassB.class);

        System.out.println("set = " + set);
        System.out.println("------------------------------");

        List<OneInterface> list = new ArrayList<OneInterface>();
        for (Class<?> c : set) {
            try {
                // 调用newInstance方式时才实例化
                OneInterface oif = (OneInterface)c.newInstance();
                list.add(oif);
                oif.doSomeThing();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        System.out.println("list = " + list);
    }

}
