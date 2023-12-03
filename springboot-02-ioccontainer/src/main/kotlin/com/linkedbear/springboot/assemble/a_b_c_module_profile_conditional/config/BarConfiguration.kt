package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Bar
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.condition.ExistBossCondition
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
open class BarConfiguration {
    @Bean
    @Conditional(ExistBossCondition::class)
    open fun bbbar(): Bar {
        return Bar()
    }
}