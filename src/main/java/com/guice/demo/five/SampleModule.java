package com.guice.demo.five;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
public class SampleModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder<IHelloPrinter> printers = Multibinder.newSetBinder(binder(), IHelloPrinter.class);
        printers.addBinding().to(SimpleHelloPrinter.class);
        printers.addBinding().to(ComplexHelloPrinter.class);
    }
}
