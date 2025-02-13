package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.registrar

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Waiter
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.RootBeanDefinition
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar
import org.springframework.core.type.AnnotationMetadata

open class WaiterRegistrar : ImportBeanDefinitionRegistrar {
    override fun registerBeanDefinitions(metaData: AnnotationMetadata, registry: BeanDefinitionRegistry) {
        println("WaiterRegistrar.registerBeanDefinitions() invoked ......")
        registry.registerBeanDefinition("waiter", RootBeanDefinition(Waiter::class.java))
    }
}