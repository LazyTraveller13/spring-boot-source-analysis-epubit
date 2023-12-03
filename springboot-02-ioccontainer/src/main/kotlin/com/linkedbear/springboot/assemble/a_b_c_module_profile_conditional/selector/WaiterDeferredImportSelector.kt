package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.selector

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Waiter
import org.springframework.context.annotation.DeferredImportSelector
import org.springframework.core.type.AnnotationMetadata

open class WaiterDeferredImportSelector: DeferredImportSelector {
    override fun selectImports(p0: AnnotationMetadata): Array<String> {
        println("WaiterDeferredImportSelector.selectImports() invoked ......")
        return arrayOf(Waiter::class.java.name)
    }

}