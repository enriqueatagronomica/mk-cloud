package com.exacttarget.client;

import java.util.Properties;

public class PropertiesUtil {
    private static PropertiesUtil _instance = new PropertiesUtil();
    Properties properties;

    public void init() {
        try {
            if (properties == null || properties.isEmpty()) {
                java.io.InputStream inConfig = PropertiesUtil.class.getClassLoader().getResourceAsStream("props.xml");
                properties.loadFromXML(inConfig);
                //properties.load(inConfig);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private PropertiesUtil() {
        super();
        properties = new Properties();
        init();
    }

    public static PropertiesUtil getInstance() {
        return _instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}