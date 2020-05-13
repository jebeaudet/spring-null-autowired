/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.nullautowired.utils.Assert;

@Component
public class BeanE
{
    @Autowired
    private BeanD beanD;

    @PostConstruct
    public void postConstruct()
    {
        Assert.noNullElements(beanD);
    }
}
