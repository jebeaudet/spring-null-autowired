/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.beans;

import com.example.nullautowired.utils.Assert;

public class BeanB
{
    private BeanA beanA;

    public BeanB(BeanA beanA)
    {
        this.beanA = beanA;

        System.out.println("BeanA instance : " + beanA);

        Assert.noNullElements(beanA);
    }
}
