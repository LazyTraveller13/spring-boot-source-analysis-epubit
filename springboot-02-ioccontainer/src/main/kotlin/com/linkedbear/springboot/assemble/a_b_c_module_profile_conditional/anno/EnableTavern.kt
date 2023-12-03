package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.anno

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Boss
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config.BartenderConfiguration
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.registrar.WaiterRegistrar
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.selector.BarImportSelector
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.selector.WaiterDeferredImportSelector
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