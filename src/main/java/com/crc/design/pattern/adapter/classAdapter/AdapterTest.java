package com.crc.design.pattern.adapter.classAdapter;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 14:56
 * @descripton: 类适配器模式测试类
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
