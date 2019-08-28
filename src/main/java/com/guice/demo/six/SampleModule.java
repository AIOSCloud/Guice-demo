package com.guice.demo.six;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
public class SampleModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, IHelloPrinter> printers = MapBinder.newMapBinder(binder(), String.class, IHelloPrinter.class);
        printers.addBinding("simple").to(SimpleHelloPrinter.class);
        printers.addBinding("complex").to(ComplexHelloPrinter.class);
    }
}
