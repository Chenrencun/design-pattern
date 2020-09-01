package com.crc.design.pattern.templateMethod;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:14
 * @descripton: 模板方法模式测试类
 */
public class TemplateMethodTest {

    public static void main(String[] args) {

        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
