package com.wangz.jdk_8.functional;

/**
 * 函数式接口：有且仅有一个抽象方法，
 * 但可以有多个非抽象方法的接口（需要 default 关键字修饰, 或写成 static 方法）
 * 可以被隐式转换为 lambda 表达式
 */
@FunctionalInterface// 该注解可以不加，主要用于编译级错误检查
public interface FunctionalInterfaceService {

    // 有且仅有一个抽象方法
    void abstractFunc();

    /**
     * default : 表明该方法是接口的默认方法，其实现类可以不用自己实现
     * 目的是为了解决接口的修改，导致现有的实现该接口的类需要修改
     * 默认方法也可以被重写。
     */
    default void concreteFunc1(){
        System.out.println("this is a concreteFunc1~");
    }

    default void concreteFunc2(){
        System.out.println("this is a concreteFunc2~");
    }

    static void staticFunc(){
        System.out.println("this is a staticFunc~");
    }

    public static void main(String[] args) {

        FunctionalInterfaceService functionalInterfaceService = () -> System.out.println("impl abstractFunc~");
        functionalInterfaceService.abstractFunc();// impl abstractFunc~
        functionalInterfaceService.concreteFunc1();// this is a concreteFunc~
        functionalInterfaceService.concreteFunc2();// this is a concreteFunc2~
        FunctionalInterfaceService.staticFunc(); // this is a staticFunc~
    }
}
