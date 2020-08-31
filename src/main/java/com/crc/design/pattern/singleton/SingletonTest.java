package com.crc.design.pattern.singleton;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-08-31 17:46
 * @descripton:
 */
public class SingletonTest {

    public static void main(String[] args) {

        HungrySingle hungrySingle1 = HungrySingle.getInstance();
        HungrySingle hungrySingle2 = HungrySingle.getInstance();
        System.out.println(hungrySingle1 == hungrySingle2);

        LazySingletonForSafe lazySingletonForSafe1 = LazySingletonForSafe.getInstance();
        LazySingletonForSafe lazySingletonForSafe2 = LazySingletonForSafe.getInstance();
        System.out.println(lazySingletonForSafe1 == lazySingletonForSafe2);

        LazySingletonForNotSafe lazySingletonForNotSafe1 = LazySingletonForNotSafe.getInstance();
        LazySingletonForNotSafe lazySingletonForNotSafe2 = LazySingletonForNotSafe.getInstance();
        System.out.println(lazySingletonForNotSafe1 == lazySingletonForNotSafe2);

    }
}
