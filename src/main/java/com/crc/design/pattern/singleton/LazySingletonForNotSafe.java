package com.crc.design.pattern.singleton;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-08-31 17:38
 * @descripton: 单例模式（懒汉式、单线程下）
 */
public class LazySingletonForNotSafe {

    private static LazySingletonForNotSafe lazySingleton;

    private LazySingletonForNotSafe(){

    }

    public static LazySingletonForNotSafe getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingletonForNotSafe();
        }
        return lazySingleton;
    }

}
