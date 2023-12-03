package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config;

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    
    @Bean
    public Bar bbbar() {
        return new Bar();
    }
}
