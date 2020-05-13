package com.example.nullautowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

import com.example.nullautowired.configuration.notworking.NotWorkingMetaConfigClass;

@SpringBootConfiguration
@Import({ NotWorkingMetaConfigClass.class })
//@Import({ WorkingMetaConfigClass.class })
public class NullAutowiredApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(NullAutowiredApplication.class, args);
        System.out.println("Success!");
    }
}