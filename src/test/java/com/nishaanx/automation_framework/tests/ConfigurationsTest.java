package com.nishaanx.automation_framework.tests;

import com.nishaanx.automation_framework.base.Configurations;
import java.util.Map;
import org.testng.annotations.Test;

public class ConfigurationsTest {

    //@Test
    public void testAllConfigurations() {
        System.out.println(Configurations.BROWSER);
        System.out.println(Configurations.REMOTE);
        System.out.println(Configurations.TEST_TYPE);
        System.out.println(Configurations.URL);
    }

    @Test
    public void testAllSystemProperties() {
        for (Map.Entry<Object, Object> key : System.getProperties().entrySet()) {
            System.out.println(key.getKey() + " => " + key.getValue());
        }
    }
}
