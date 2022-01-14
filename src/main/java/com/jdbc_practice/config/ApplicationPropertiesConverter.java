package com.jdbc_practice.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationPropertiesConverter {

  private String propertiesFileName = "application.properties";
  
  private static final ApplicationPropertiesConverter INSTANCE = new ApplicationPropertiesConverter();
  
  private ApplicationPropertiesConverter() {
    
  }
  
  public static ApplicationPropertiesConverter getInstance() {
    return INSTANCE;
  }

  public String getPropertyValue(String propertyKey) throws IOException {
    Properties properties = new Properties();
    String propertyValue = "";

    try (InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream(propertiesFileName);) {
      if (inputStream != null) {
        properties.load(inputStream);
      } else {
        throw new FileNotFoundException("Properties file is not found");
      }
    }
    return propertyValue = properties.getProperty(propertyKey);
  }
}
