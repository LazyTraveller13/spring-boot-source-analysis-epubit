package com.linkedbear.springboot.assemble.a_module.anno

import com.linkedbear.springboot.assemble.a_module.component.Boss
import com.linkedbear.springboot.assemble.a_module.config.BartenderConfiguration
import com.linkedbear.springboot.assemble.a_module.registrar.WaiterRegistrar
import com.linkedbear.springboot.assemble.a_module.selector.BarImportSelector
import com.linkedbear.springboot.assemble.a_module.selector.WaiterDeferredImportSelector
import org.springframework.context.annotation.Import

@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(
    Boss::class,
    BartenderConfiguration::class,
    BarImportSelector::class,
    WaiterRegistrar::class,
    WaiterDeferredImportSelector::class,
)
annotation class EnableTavern