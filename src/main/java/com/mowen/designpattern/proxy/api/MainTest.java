package com.mowen.designpattern.proxy.api;

import java.lang.reflect.Proxy;

/**
 * Created by Vincent on 4/10/16.
 */
public class MainTest {

    public static void main(String[] args) {
        PersonBean personBean = getPersonFromDatabase("Joe Javabean");

        PersonBean owerProxy = getOwnerProxy(personBean);
        System.out.println("Name is " + owerProxy.getName());
        owerProxy.setInterests("Bowling, Go");
        System.out.println("Interests are " + owerProxy.getInterests());

        try {
            owerProxy.setHotOrNotRating(9);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
    }

    private static PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));

    }

    private static PersonBean getPersonFromDatabase(String name) {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender("Female");  //Male, Others
        personBean.setHotOrNotRating(8);
        personBean.setInterests("Swimming");
        return personBean;
    }
}
