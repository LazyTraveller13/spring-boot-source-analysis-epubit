package com.david.springboot.beandefinition

import com.david.springboot.beandefinition.config.BeanDefinitionConfiguration
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class AnnotationConfigBeanDefinitionConfiguration {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ctx = AnnotationConfigApplicationContext(BeanDefinitionConfiguration::class.java)
            val personBeanDefinition = ctx.getBeanDefinition("person")
            println(personBeanDefinition)
            println(personBeanDefinition.javaClass.name)
        }
    }
}