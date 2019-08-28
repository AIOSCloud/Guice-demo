package com.guice.demo.second;

import com.google.inject.ImplementedBy;

/*******************************************************************************
 * 版权信息：北京中通天鸿武汉分公司
 * @author xuchang
 * Copyright: Copyright (c) 2007北京中通天鸿武汉分公司,Inc.All Rights Reserved.
 * Description:
 ******************************************************************************/
@ImplementedBy(ComplexHelloPrinter.class)
public interface IHelloPrinter {
    void print();
}
