package com.nishaanx.automation_framework.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class Configurations {

    public static final String URL = getProp().getProperty("nishaanx.web.url");//"https://beta.nishaanx.in/sign_in";
    public static final String BROWSER = getProp().getProperty("nishaanx.browser");//"ANDROID";
    public static final boolean REMOTE = Boolean.parseBoolean(getProp().getProperty("nishaanx.remote"));//false;
    public static String TEST_TYPE = getProp().getProperty("nishaanx.test_type");//"MOBILE";
    public static long TIME_OUT_SECONDS = Long.parseLong(getProp().getProperty("nishaanx.timeout.seconds"));
    public static String CHROME_DRIVER_EXE = getProp().getProperty("nishaanx.chrome.driver");
    public static String FIREFOX_DRIVER_EXE = getProp().getProperty("nishaanx.gecko.driver");
    public static String IE_DRIVER_EXE = getProp().getProperty("nishaanx.ie.driver");

    private static Properties prop;
    private static HashMap<String, String> urlMap;
    public static String SELENIUM_GRID_URL = getProp().getProperty("nishaanx.hub.url");

    private static Properties getProp() {

        if (prop == null) {
            prop = new Properties();
            InputStream input = null;

            try {
                input = new FileInputStream(new File(Res.getResource("system.properties").toURI()));
                prop.load(input);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return prop;
    }
}
