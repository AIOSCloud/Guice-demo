package com.guice.demo.second;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import sun.java2d.pipe.SpanShapeRenderer;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
@Singleton
public class Sample {
    @Inject
    private IHelloPrinter printer;

    public void hello() {
        printer.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        Sample sample = injector.getInstance(Sample.class);
        sample.hello();
    }
}
