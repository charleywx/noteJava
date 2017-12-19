package stream;

import java.util.*;
import java.util.concurrent.*;

/*
 *   CopyOnWriteArraySet是“线程安全”的集合，而HashSet是非线程安全的。
 *
 *   下面是“多个线程同时操作并且遍历集合set”的示例
 *   (01) 当set是CopyOnWriteArraySet对象时，程序能正常运行。
 *   (02) 当set是HashSet对象时，程序会产生ConcurrentModificationException异常。
 *
 * @author skywang
 */
public class CopyOnWriteArraySetTest1 {
    
    // TODO: set是HashSet对象时，程序会出错。
    private static Set<String> set = new HashSet<String>();
//    private static Set<String> set = new CopyOnWriteArraySet<String>();
    
    public static void main(String[] args) {
        // 同时启动两个线程对set进行操作！
        new MyThread("a").start();
        new MyThread("b").start();
    }
    
    private static void printAll() {
        String value = null;
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            value = (String) iter.next();
            System.out.print(value + ", ");
        }
        System.out.println();
    }
    
    private static class MyThread extends Thread {
        MyThread(String name) {
            super(name);
        }
        
        @Override
        public void run() {
            int i = 0;
            while (i++ < 10) {
                // “线程名” + "-" + "序号"
//                String val = Thread.currentThread().getName() + "-" + (i % 6);
                String val = Thread.currentThread().getName() + "-" + i;
                set.add(val);
                // 通过“Iterator”遍历set。
                printAll();
            }
        }
    }
}
    
    
    /*// 创建一个空 set。
    CopyOnWriteArraySet()
    // 创建一个包含指定 collection 所有元素的 set。
    CopyOnWriteArraySet(Collection<? extends E> c)
    
    // 如果指定元素并不存在于此 set 中，则添加它。
    boolean add(E e)
    // 如果此 set 中没有指定 collection 中的所有元素，则将它们都添加到此 set 中。
    boolean addAll(Collection<? extends E> c)
    // 移除此 set 中的所有元素。
    void clear()
    // 如果此 set 包含指定元素，则返回 true。
    boolean contains(Object o)
    // 如果此 set 包含指定 collection 的所有元素，则返回 true。
    boolean containsAll(Collection<?> c)
    // 比较指定对象与此 set 的相等性。
    boolean equals(Object o)
    // 如果此 set 不包含任何元素，则返回 true。
    boolean isEmpty()
    // 返回按照元素添加顺序在此 set 中包含的元素上进行迭代的迭代器。
    Iterator<E> iterator()
    // 如果指定元素存在于此 set 中，则将其移除。
    boolean remove(Object o)
    // 移除此 set 中包含在指定 collection 中的所有元素。
    boolean removeAll(Collection<?> c)
    // 仅保留此 set 中那些包含在指定 collection 中的元素。
    boolean retainAll(Collection<?> c)
    // 返回此 set 中的元素数目。
    int size()
    // 返回一个包含此 set 所有元素的数组。
    Object[] toArray()
    // 返回一个包含此 set 所有元素的数组；返回数组的运行时类型是指定数组的类型。
    <T> T[] toArray(T[] a)*/