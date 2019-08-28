package com.guice.demo.six;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

import java.util.Map;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
@Singleton
public class Sample {
    @Inject
    private Map<String, IHelloPrinter> printers;

    public void hello() {
        for (String name : printers.keySet()) {
            printers.get(name).print();
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SampleModule());
        Sample sample = injector.getInstance(Sample.class);
        sample.hello();
    }
}
