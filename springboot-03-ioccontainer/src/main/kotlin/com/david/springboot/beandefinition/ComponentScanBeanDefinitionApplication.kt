package com.david.springboot.beandefinition

import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ComponentScanBeanDefinitionApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ctx = AnnotationConfigApplicationContext("com.david.springboot.beandefinition.bean")
            val personDefinition = ctx.getBeanDefinition("person")
            println(personDefinition)
            println(personDefinition.javaClass.name)
        }
    }
}