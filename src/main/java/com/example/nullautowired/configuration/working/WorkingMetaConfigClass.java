/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.configuration.working;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.nullautowired.beans.BeanE;

@Configuration
@Import({ BeanE.class, WorkingConfigClass.class })
public class WorkingMetaConfigClass
{

}
