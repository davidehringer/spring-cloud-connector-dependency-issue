package org.springframework.cloud.connector.dependency;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CloudConfig.class })
public class CloudConfigTest {

    @Autowired
    private MyService service;

    @BeforeClass
    public static void setLocalCloud() {
        System.setProperty("spring.cloud.propertiesFile",
                "src/test/resources/spring-cloud.properties");
    }

    @AfterClass
    public static void clearLocalCloud() {
        System.clearProperty("spring.cloud.propertiesFile");
    }

    @Test
    public void anExampleServiceIsInstantiated() {
        assertNotNull(service);
        assertThat(service.getStuff(), is("some-data"));
    }
}
