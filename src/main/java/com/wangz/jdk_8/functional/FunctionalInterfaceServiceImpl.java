package com.wangz.jdk_8.functional;

/**
 * @ClassName FunctionalInterfaceServiceImpl
 * @Auther: wz1016_vip@163.com
 * @Date: 2019/6/17 23:44
 * @Description: TODO
 */
public class FunctionalInterfaceServiceImpl implements FunctionalInterfaceService {
    @Override
    public void abstractFunc() {

    }


    // 以下默认方法可以重写也可以不重写
    @Override
    public void concreteFunc1() {
        FunctionalInterfaceService.super.concreteFunc1();
    }

//    @Override
//    public void concreteFunc2() {
//
//    }



}
