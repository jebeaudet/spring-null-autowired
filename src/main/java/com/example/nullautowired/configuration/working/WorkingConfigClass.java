/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.configuration.working;

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
public class WorkingConfigClass
{
    @Autowired
    private BeanA beanA;
    @Autowired
    private BeanC beanC;

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
