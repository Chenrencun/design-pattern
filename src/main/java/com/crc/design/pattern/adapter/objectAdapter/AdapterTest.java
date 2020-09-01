package com.crc.design.pattern.adapter.objectAdapter;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 15:03
 * @descripton: 对象适配器模式测试类
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
