package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config;

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {
    
    @Bean
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }
    
    @Bean
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }
}
