package com.crc.design.pattern.strategy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 16:37
 * @descripton: 环境类
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
