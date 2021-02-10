package com.spring.demo;

import com.spring.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Component
 * @Service
 * @Controller
 * @Repository
 * 上面的四个注解的功能都是一样的，都是用来创建Bean实例，字面区分而已
 *
 * @AutoWired 根据属性类型进行自动注入
 * @Qualifier 根据属性名称进行注入(配合AutoWired使用)
 * @Resource 可以根据属性类型也可以根据名称进行注入
 * @Value 注入普通类型属性
 *
 * 使用注解的步骤
 * 1.引入AOP依赖
 * 2.开启组件扫描
 */
@Component("demo01")
public class demo01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("xiaozhang"));
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
