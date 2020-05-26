package io.xstefank;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@ApplicationScoped
@A
@Default
public class MyBeanA implements MyBean {
    public String getHello() {
        return "A";
    }
}
