package com.david.springboot.beandefinition.bean

import org.springframework.stereotype.Component

@Component
class Person {
    private var name: String? = null
    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }
}
