package com.lxq18.learn.jvm;

/**
 * @author lixiaoqiang
 * @create 2021/1/2 10:34
 */
public class HelloWorld {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocate1, allocate2;
        allocate1 = new byte[_1MB];
        allocate2 = new byte[_1MB];
        System.out.println("end");
    }
}
