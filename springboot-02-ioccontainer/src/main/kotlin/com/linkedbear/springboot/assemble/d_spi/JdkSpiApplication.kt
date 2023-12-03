package com.linkedbear.springboot.assemble.d_spi

import com.linkedbear.springboot.assemble.d_spi.bean.DemoDao
import java.util.ServiceLoader

class JdkSpiApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val serviceLoader = ServiceLoader.load(DemoDao::class.java)
            serviceLoader.forEach {
                println(it)
            }
        }
    }
}