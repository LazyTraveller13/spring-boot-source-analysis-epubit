package com.david.springboot

import com.david.springboot.service.DemoService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@EnableAspectJAutoProxy
@SpringBootApplication
class SpringBootAopApplication

fun main(args: Array<String>) {
    val ctx = SpringApplication.run(SpringBootAopApplication::class.java, *args)
    ctx.getBean(DemoService::class.java).save()
}