package com.david.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringApplicationApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringApplicationApplication::class.java, *args)

    //  直接操作 API
//      val springApplication = SpringApplication()
//      springApplication.sources = setOf(SpringApplicationApplication::class.java.name)
//      springApplication.setBannerMode(Banner.Mode.OFF)
//      springApplication.run(*args)

    //  借助构造器
//    SpringApplicationBuilder(SpringApplicationApplication::class.java)
//        .bannerMode(Banner.Mode.OFF)
//        .web(WebApplicationType.NONE)
//        .run(*args)

}