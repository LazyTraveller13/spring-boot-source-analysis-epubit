package com.linkedbear.springboot.assemble.a_module.condition

import com.linkedbear.springboot.assemble.a_module.component.Boss
import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.type.AnnotatedTypeMetadata

class ExistBossCondition: Condition {
    override fun matches(ctx: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {
        return ctx.beanFactory?.containsBeanDefinition(Boss::class.java.name) ?: false
    }
}