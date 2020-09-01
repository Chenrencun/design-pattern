package com.crc.design.pattern.strategy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:28
 * @descripton: 策略模式测试类
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.strategyMethod();

        context = new Context(new ConcreteStrategy2());
        context.strategyMethod();
    }
}
