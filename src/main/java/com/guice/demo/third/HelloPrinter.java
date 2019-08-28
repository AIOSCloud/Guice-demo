package com.guice.demo.third;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
public class HelloPrinter {
    private static int counter;
    private int myCounter;

    public HelloPrinter() {
        myCounter = counter++;
    }

    public void print() {
        System.out.printf("Hello Word %d\n", myCounter);
    }
}
