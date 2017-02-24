package com.micro.service1;

import com.micro.service1.controller.SampleBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Zoltan_Hamori on 2/23/2017.
 */
@Aspect
@Component
public class LoggerAspect {

    private static Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);

    @Autowired
    private SampleBean bean;

    @Around("execution(@Loggable * *(..))")
    public Object logger(ProceedingJoinPoint point) throws Throwable {

        Object result = point.proceed();
        LOGGER.info("Aspect called" );
       LOGGER.info("Aspect called 2" + bean.getHello(MethodSignature.class.cast(point.getSignature()).getMethod().getName()));

        return result;

    }
}
