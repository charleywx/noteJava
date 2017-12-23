package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface MyTarget {

    /**
     * 如果注解中有一个属性名字叫value,则在应用时可以省略属性名字不写。
     * 可见，@Retention(RetentionPolicy.RUNTIME )注解中，RetentionPolicy.RUNTIME是注解属性值，属性名字是value,
     * 属性的返回类型是RetentionPolicy，如下：
     *
     * @return
     */
//    String value();

    /**
     * 注解@Target也是用来修饰注解的元注解，它有一个属性ElementType也是枚举类型，
     * 值为：ANNOTATION_TYPE CONSTRUCTOR  FIELD LOCAL_VARIABLE METHOD PACKAGE PARAMETER TYPE
     * 如@Target(ElementType.METHOD) 修饰的注解表示该注解只能用来修饰在方法上。
     *
     * @return
     */
//    String value() default "hahaha";

}
