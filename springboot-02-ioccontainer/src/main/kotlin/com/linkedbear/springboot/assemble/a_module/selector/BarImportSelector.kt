package com.linkedbear.springboot.assemble.a_module.selector

import com.linkedbear.springboot.assemble.a_module.component.Bar
import com.linkedbear.springboot.assemble.a_module.config.BarConfiguration
import org.springframework.context.annotation.ImportSelector
import org.springframework.core.type.AnnotationMetadata

class BarImportSelector: ImportSelector {
    override fun selectImports(importingClassMetaData: AnnotationMetadata): Array<String> {
        println("BarImportSelector.selectImports() invoked ......")
        return arrayOf(Bar::class.java.name, BarConfiguration::class.java.name)
    }
}