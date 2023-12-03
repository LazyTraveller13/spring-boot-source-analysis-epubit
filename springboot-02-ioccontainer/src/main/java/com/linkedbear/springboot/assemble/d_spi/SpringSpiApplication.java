package com.linkedbear.springboot.assemble.d_spi;

import com.linkedbear.springboot.assemble.d_spi.bean.DemoDao;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

public class SpringSpiApplication {
    
    public static void main(String[] args) throws Exception {
        List<DemoDao> demoDaos = SpringFactoriesLoader
                .loadFactories(DemoDao.class, SpringSpiApplication.class.getClassLoader());
        demoDaos.forEach(System.out::println);
    
        System.out.println("------------------------------------------------");
    
        List<String> daoClassNames = SpringFactoriesLoader
                .loadFactoryNames(DemoDao.class, SpringSpiApplication.class.getClassLoader());
        daoClassNames.forEach(System.out::println);
    }
}
