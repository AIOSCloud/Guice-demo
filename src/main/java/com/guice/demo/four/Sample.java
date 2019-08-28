package com.guice.demo.four;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
public class Sample {
    @Inject
    @Named("simple")
    private IHelloPrinter simplePrinter;

    @Inject
    @Named("complex")
    private IHelloPrinter complexPrinter;

    public void hello() {
        simplePrinter.print();
        complexPrinter.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SampleMoudle());
        Sample sample = injector.getInstance(Sample.class);
        sample.hello();
    }
}
