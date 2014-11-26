package org.springframework.cloud.connector.dependency;

public class MyService {

    private final String stuff;

    public MyService(String stuff) {
        this.stuff = stuff;
    }

    public String getStuff() {
        return stuff;
    }

}
