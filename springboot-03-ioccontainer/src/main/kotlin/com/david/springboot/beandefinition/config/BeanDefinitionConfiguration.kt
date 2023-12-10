package com.david.springboot.beandefinition.config

import com.david.springboot.beandefinition.bean.Person
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BeanDefinitionConfiguration {
    @Bean
    open fun person(): Person {
        return Person()
    }
}