/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.configuration.notworking;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.nullautowired.beans.BeanE;

@Configuration
@Import({ BeanE.class, NotWorkingConfigClass.class })
public class NotWorkingMetaConfigClass
{

}
