package com.crc.design.pattern.singleton;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-08-31 17:35
 * @descripton: 单例模式（饿汉式）
 */
public class HungrySingle {

    private static final HungrySingle singleton = new HungrySingle();

    private HungrySingle(){

    }

    public static HungrySingle getInstance(){
        return singleton;
    }
}
