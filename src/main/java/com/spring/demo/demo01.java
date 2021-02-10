package com.spring.demo;

import com.spring.Interface.UserDao;
import com.spring.Interface.impl.UserDaoImpl;
import com.spring.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) {
        final UserDao userDao=new UserDaoImpl();
        Class[] interfaces={UserDao.class};
        UserDao proxyInstance = (UserDao) Proxy.newProxyInstance(demo01.class.getClassLoader(), interfaces, new InvocationHandler() {
            //1.把实际对象传递进来
            private Object object;

            public InvocationHandler aspect(Object obj){
                object=obj;
                return this;
            }

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("方法之前执行..." + method.getName() + "传递的参数..." + Arrays.toString(args));

                Object res = method.invoke(object, args);

                System.out.println("方法之后执行..." + method.getName() + "传递的参数..." + Arrays.toString(args));

                return res;
            }
        }.aspect(userDao));

        proxyInstance.add(1, 2);
        proxyInstance.update("6");

        //System.out.println();
    }
}
