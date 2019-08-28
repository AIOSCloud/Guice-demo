package com.guice.demo.first;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
@Singleton
public class HelloPrinter {
    public void print() {
        System.out.println("Hello Word");
    }
}
