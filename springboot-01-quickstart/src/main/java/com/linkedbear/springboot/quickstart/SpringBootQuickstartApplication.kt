package com.linkedbear.springboot.quickstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringBootQuickstartApplication

fun main(args: Array<String>) {
    runApplication<SpringBootQuickstartApplication>(args = args)
}
