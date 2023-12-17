package com.david.springboot.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class ServiceAspect {
    @Before("execution(public * com.david.springboot.service.*.*(..))")
    fun beforePrint() {
        println("Service Aspect before advice run ......")
    }
}