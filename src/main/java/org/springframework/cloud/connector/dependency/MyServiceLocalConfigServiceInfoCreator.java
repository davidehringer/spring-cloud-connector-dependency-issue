package org.springframework.cloud.connector.dependency;

import org.springframework.cloud.localconfig.LocalConfigServiceInfoCreator;

public class MyServiceLocalConfigServiceInfoCreator extends
        LocalConfigServiceInfoCreator<MyServiceServiceInfo> {

    private static final String KEY_SCHEME = "myService";
    private static final String URI_PREFIX = KEY_SCHEME + "://";

    public MyServiceLocalConfigServiceInfoCreator() {
        super(KEY_SCHEME);
    }

    @Override
    public MyServiceServiceInfo createServiceInfo(String id, String uri) {
        return new MyServiceServiceInfo(id, trimScheme(uri));
    }

    private String trimScheme(String uriString) {
        if (uriString.startsWith(URI_PREFIX)) {
            return uriString.substring(URI_PREFIX.length());
        }
        return uriString;
    }

}
