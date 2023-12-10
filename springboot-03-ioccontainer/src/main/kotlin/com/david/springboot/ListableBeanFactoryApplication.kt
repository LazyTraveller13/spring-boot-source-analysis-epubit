package com.david.springboot

import com.david.springboot.animals.Dog
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader
import org.springframework.core.io.ClassPathResource

class ListableBeanFactoryApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val resource = ClassPathResource("container/listable-container.xml")
            val beanFactory = DefaultListableBeanFactory()
            // 手动注册一个单实例 bean
            beanFactory.registerSingleton("doggg", Dog())
            val beanDefinitionReader = XmlBeanDefinitionReader(beanFactory)
            beanDefinitionReader.loadBeanDefinitions(resource)
            println("加载 XML 文件后容器中的 Bean 如下：")
            beanFactory.beanDefinitionNames.forEach { println(it) }
            println("doggg 是否存在：${beanFactory.containsBean("doggg")}")
        }
    }

}