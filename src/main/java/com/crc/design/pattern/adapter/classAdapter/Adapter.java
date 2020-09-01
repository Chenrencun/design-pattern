package com.crc.design.pattern.adapter.classAdapter;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 14:55
 * @descripton: 适配器类（类适配器）
 */
public class Adapter extends Adaptee implements Target{

    public void request() {
        specialRequest();
    }
}
