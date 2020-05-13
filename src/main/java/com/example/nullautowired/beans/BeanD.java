/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.beans;

import com.example.nullautowired.utils.Assert;

public class BeanD
{
    private BeanA beanA;
    private BeanB beanB;
    private BeanC beanC;

    public BeanD(BeanA beanA, BeanB beanB, BeanC beanC)
    {
        this.beanA = beanA;
        this.beanB = beanB;
        this.beanC = beanC;

        Assert.noNullElements(beanA, beanB, beanC);
    }
}
