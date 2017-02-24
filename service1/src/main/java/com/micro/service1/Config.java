package com.micro.service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Zoltan_Hamori on 2/23/2017.
 */
@Configuration
@ComponentScan("com.micro.service1.controller")
@EnableAspectJAutoProxy
public class Config {


}
