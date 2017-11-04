package bean;

public class ClassB implements OneInterface {
//    public ClassB() {
//        System.out.println("进入ClassB的构造方法");
//    }

    public void doSomeThing() {
        System.out.println("进入ClassB的doSomeThing方法");
    }

    public void init() {
        System.out.println("进入ClassB的init方法");
    }
}