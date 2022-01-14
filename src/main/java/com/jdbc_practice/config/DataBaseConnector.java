package com.jdbc_practice.config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnector {

  private String url;
  private String userName;
  private String password;
  private ApplicationPropertiesConverter converter = ApplicationPropertiesConverter.getInstance();

  private static final DataBaseConnector INSTANCE = new DataBaseConnector();

  private DataBaseConnector() {

  }

  public static DataBaseConnector getInstance() {
    return INSTANCE;
  }

  private void setConnectionParametersWithProperties() throws IOException{
     url = converter.getPropertyValue("url");
     userName = converter.getPropertyValue("userName");
     password = converter.getPropertyValue("password");
  }

  public Connection getDataBaseConnection() throws IOException{

    Connection connection = null;
    
    setConnectionParametersWithProperties();
    try {
      connection = DriverManager.getConnection(url, userName, password);
    } catch (Exception e) {
      throw new RuntimeException("Unable to get DB connection");
    }
    return connection;
  }


}
