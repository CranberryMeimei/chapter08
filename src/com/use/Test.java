package com.use;

import com.xiaoqiang.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);//?hashcode 16进制

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();//一点要写包名区分
        System.out.println(dog1);


    }
}
