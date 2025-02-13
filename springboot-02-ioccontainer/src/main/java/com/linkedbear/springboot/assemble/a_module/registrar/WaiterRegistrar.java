package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.registrar;

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Waiter;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class WaiterRegistrar implements ImportBeanDefinitionRegistrar {
    
    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        System.out.println("WaiterRegistrar invoke ......");
        registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
    }
}
