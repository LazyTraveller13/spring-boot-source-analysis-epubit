package com.linkedbear.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationApplication.class, args);

//        SpringApplication springApplication = new SpringApplication();
//        springApplication.setMainApplicationClass(SpringApplicationApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
//
//        new SpringApplicationBuilder(SpringApplicationApplication.class)
//                .bannerMode(Banner.Mode.OFF)
//                .web(WebApplicationType.NONE)
//                .run(args);

//        new SpringApplicationBuilder(SpringApplicationApplication.class).listeners(new ApplicationStartingListener()).run(args);
    }
}
