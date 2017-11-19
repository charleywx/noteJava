package annotation;

/**
 * 定义了一个MyTest类，用注解@MyAnnotation修饰，注解@MyAnnotation定义的属性都赋了值
 */
@MyAnnotation(hello = "beijing", world = "shanghai", array = {}, style = int.class)
public class MyTest {
    @MyAnnotation(lannotation = @MyTarget(), world = "shanghai", array = {1, 2, 3})
    @Deprecated
    public void output() {
        System.out.println("output something!");
    }
}  