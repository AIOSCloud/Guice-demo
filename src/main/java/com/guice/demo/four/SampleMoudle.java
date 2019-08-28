package com.guice.demo.four;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
public class SampleMoudle extends AbstractModule {

    @Override
    protected void configure() {
        bind(IHelloPrinter.class).annotatedWith(Names.named("simple")).to(SimpleHelloPrinter.class);
        bind(IHelloPrinter.class).annotatedWith(Names.named("complex")).to(ComplexHelloPrinter.class);
    }
}
