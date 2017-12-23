package annotation;

import java.lang.reflect.Method;

/**
 * 定义个一注解@MyTarget，用RetentionPolicy.RUNTIME修饰；
 * 上面程序打印：@annotation.MyTarget()，如果RetentionPolicy值不为RUNTIME,则不打印。
 *
 * @Retention(RetentionPolicy.SOURCE )
 * public @interface Override
 * @Retention(RetentionPolicy.SOURCE )
 * public @interface SuppressWarnings
 * @Retention(RetentionPolicy.RUNTIME )
 * public @interface Deprecated
 * 由上可以看出，只有注解@Deprecated在运行时可以被JVM读取到
 */
public class MyTargetTest {

    @MyTarget
//    @MyTarget("aaa")
    public void doSomething() {
        System.out.println("hello world");
    }

    public static void main(String[] args) throws Exception {
        Method method = MyTargetTest.class.getMethod("doSomething", null);
        if (method.isAnnotationPresent(MyTarget.class))//如果doSomething方法上存在注解@MyTarget，则为true
        {
            System.out.println(method.getAnnotation(MyTarget.class));
        }
    }

}  