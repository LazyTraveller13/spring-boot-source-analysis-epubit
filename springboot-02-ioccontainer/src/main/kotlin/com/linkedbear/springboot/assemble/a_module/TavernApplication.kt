package com.linkedbear.springboot.assemble.a_module

import com.linkedbear.springboot.assemble.a_module.component.Bartender
import com.linkedbear.springboot.assemble.a_module.config.TavernConfiguration
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class TavernApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ctx = AnnotationConfigApplicationContext(TavernConfiguration::class.java)
            ctx.beanDefinitionNames.forEach { println(it) }
            println("--------------------------------")
            val bartenders = ctx.getBeansOfType(Bartender::class.java)
            bartenders.forEach { (_, v) ->  println(v) }
        }
    }
}