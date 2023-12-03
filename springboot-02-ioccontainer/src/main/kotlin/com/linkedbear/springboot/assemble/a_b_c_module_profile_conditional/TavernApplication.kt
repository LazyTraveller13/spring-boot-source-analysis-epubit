package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Bartender
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config.TavernConfiguration
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