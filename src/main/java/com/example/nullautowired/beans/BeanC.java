/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.nullautowired.utils.Assert;

@Component
public class BeanC
{
    @Autowired
    private BeanA beanA;
    @Autowired
    private BeanB beanB;

    @PostConstruct
    public void postConstruct()
    {
        Assert.noNullElements(beanA, beanB);
    }
}
