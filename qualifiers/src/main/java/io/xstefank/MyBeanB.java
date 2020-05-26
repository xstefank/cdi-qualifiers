package io.xstefank;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@B
public class MyBeanB implements MyBean {
    public String getHello() {
        return "B";
    }
}
