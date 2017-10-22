package se.base;

import bean.Person;

/**
 * 类型后面三个点
 * 表示不定参数，也就是调用这个方法的时候这里可以传入多个String对象
 */
public class ThreePoint {
    
    public static void main(String[] args) {
        // 测试字符串
        test("hello", "world", "adf", "uuuuu", "uuu", "qqqq");
        
        // 测试整数
        test1(111, 222, 333, 555, 6777);
        
        // 测试对象
        Person p1 = Person.getPerson("张三", 18);
        Person p2 = Person.getPerson("李四", 29);
        test2(p1, p2);
    }
    
    /**
     * 输出结果：
     * hello
     * world
     * adf
     * uuuuu
     * uuu
     * qqqq
     * Process finished with exit code 0
     */
    public static void test(String... arguments) {
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }
    }
    
    /**
     * 输出结果：
     * 111
     * 222
     * 333
     * 555
     * 6777
     *
     * @param arguments
     */
    public static void test1(int... arguments) {
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }
    }
    
    /**
     输出结果：
     张三
     李四
     * @param arguments
     */
    public static void test2(Person... arguments) {
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i].name);
        }
    }
    
}
