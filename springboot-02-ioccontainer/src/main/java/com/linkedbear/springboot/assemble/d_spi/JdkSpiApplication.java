package com.linkedbear.springboot.assemble.d_spi;

import com.linkedbear.springboot.assemble.d_spi.bean.DemoDao;
import java.util.ServiceLoader;

public class JdkSpiApplication {
    
    public static void main(String[] args) {
        ServiceLoader<DemoDao> serviceLoader = ServiceLoader.load(DemoDao.class);
        serviceLoader.iterator().forEachRemaining(System.out::println);
    }
}
