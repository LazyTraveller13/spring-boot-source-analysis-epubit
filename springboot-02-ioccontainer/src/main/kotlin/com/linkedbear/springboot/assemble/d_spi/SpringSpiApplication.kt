package com.linkedbear.springboot.assemble.d_spi

import com.linkedbear.springboot.assemble.d_spi.bean.DemoDao
import org.springframework.core.io.support.SpringFactoriesLoader

class SpringSpiApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val demoDaos = SpringFactoriesLoader.loadFactories(
                DemoDao::class.java,
                SpringSpiApplication::class.java.classLoader,
            )
            demoDaos.forEach {
                println(it)
            }
            println("-------------------------------")
            val daoClassNames = SpringFactoriesLoader.loadFactoryNames(
                DemoDao::class.java,
                SpringSpiApplication::class.java.classLoader,
            )
            daoClassNames.forEach {
                println(it)
            }
        }
    }
}