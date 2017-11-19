package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 上面程序中，定义一个注解@MyAnnotation，定义了5个属性，他们的名字为：
 * hello,world,array,lamp,lannotation,style.
 * 属性hello类型为String,默认值为gege
 * 属性world类型为String,没有默认值
 * 属性array类型为数组,默认值为2，4，5，6
 * 属性lannotation类型为注解,默认值为@MyTarget，注解里的属性是注解
 * 属性style类型为Class,默认值为String类型的Class类型
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String hello() default "gege";

    String world();

    int[] array() default {2, 4, 5, 6};

    MyTarget lannotation() default @MyTarget();

    Class style() default String.class;
}  