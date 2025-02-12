package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.selector;

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Bar;
import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("BarImportSelector invoke ......");
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
