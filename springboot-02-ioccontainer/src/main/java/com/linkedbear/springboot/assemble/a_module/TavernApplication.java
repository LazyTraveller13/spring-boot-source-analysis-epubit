package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional;

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernApplication {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------");
//        Boss boss = ctx.getBean(Boss.class);
//        System.out.println(boss);
//        Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
//        bartenders.forEach((name, bartender) -> System.out.println(bartender));
    }
}
