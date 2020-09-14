package com.xocs.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greeting(String name) {
        return "Hello in uppercase " + name.toUpperCase();
    }
}
