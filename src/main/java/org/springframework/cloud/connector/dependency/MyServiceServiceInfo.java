package org.springframework.cloud.connector.dependency;

import org.springframework.cloud.service.BaseServiceInfo;

public class MyServiceServiceInfo extends BaseServiceInfo {

    private final String stuff;

    public MyServiceServiceInfo(String id, String stuff) {
        super(id);
        this.stuff = stuff;
    }

    public String getStuff() {
        return stuff;
    }

}
