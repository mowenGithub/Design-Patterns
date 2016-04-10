package com.mowen.designpattern.proxy.api;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mowen on 4/10/16.
 */
public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean;
    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else if(method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        } else if(method.getName().startsWith("set")) {
            return method.invoke(personBean, args);
        }
        return null;
    }
}
