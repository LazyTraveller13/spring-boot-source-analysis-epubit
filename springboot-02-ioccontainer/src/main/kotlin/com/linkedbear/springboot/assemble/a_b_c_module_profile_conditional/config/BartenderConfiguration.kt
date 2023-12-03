package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Bartender
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("dev")
open class BartenderConfiguration {
    @Bean
    open fun zhangxiaosan(): Bartender {
        return Bartender("张小三")
    }

    @Bean
    open fun zhangdasan(): Bartender {
        return Bartender("张大三")
    }
}