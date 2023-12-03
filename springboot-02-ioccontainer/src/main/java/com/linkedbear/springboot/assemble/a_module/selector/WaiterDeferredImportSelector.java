package com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.selector;

import com.linkedbear.springboot.assemble.a_b_c_module_profile_conditional.component.Waiter;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class WaiterDeferredImportSelector implements DeferredImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("WaiterDeferredImportSelector invoke ......");
        return new String[] {Waiter.class.getName()};
    }
}
