package com.linkedbear.springboot.assemble.a_module.config

import com.linkedbear.springboot.assemble.a_module.component.Bar
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BarConfiguration {
    @Bean
    open fun bbbar(): Bar {
        return Bar()
    }
}