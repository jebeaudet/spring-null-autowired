/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.configuration.notworking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.nullautowired.beans.BeanA;
import com.example.nullautowired.beans.BeanB;
import com.example.nullautowired.beans.BeanC;
import com.example.nullautowired.beans.BeanD;

@Configuration
@Import({ BeanA.class, BeanC.class })
public class NotWorkingConfigClass
{
    @Autowired
    private BeanC beanC;
    @Autowired
    private BeanA beanA;

    @Bean
    public BeanD beanD()
    {
        return new BeanD(beanA, beanB(), beanC);
    }

    @Bean
    public BeanB beanB()
    {
        return new BeanB(beanA);
    }
}
