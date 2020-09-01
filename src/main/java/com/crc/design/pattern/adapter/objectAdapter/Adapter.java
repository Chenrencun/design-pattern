package com.crc.design.pattern.adapter.objectAdapter;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 14:59
 * @descripton: 适配器类（对象适配器）
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specialRequest();
    }
}
