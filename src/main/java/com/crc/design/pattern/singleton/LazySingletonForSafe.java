package com.crc.design.pattern.singleton;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-08-31 17:42
 * @descripton: 单例模式（懒汉式、多线程下）
 */
public class LazySingletonForSafe {

    //volatile关键字，保证可见性
    private static volatile LazySingletonForSafe singleton;

    private LazySingletonForSafe(){

    }

    public static LazySingletonForSafe getInstance(){
        if (singleton == null){
            synchronized (LazySingletonForSafe.class){
                if (singleton == null){
                    singleton = new LazySingletonForSafe();
                }
            }
        }
        return singleton;
    }
}
