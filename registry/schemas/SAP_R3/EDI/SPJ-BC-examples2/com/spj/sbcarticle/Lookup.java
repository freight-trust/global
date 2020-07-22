package com.spj.sbcarticle;

import java.io.*;
import java.util.*;
import java.sql.*;

public class Lookup {
  public static String lookup(String key) {
    String value = "not found";

    // use JDBC to lookup value
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con = DriverManager.getConnection("jdbc:odbc:SbcLookup", "", "");
      Statement stmt = con.createStatement();
      String queryStr = "select value from SbcLookupTable where key = '" + key + "'";
      ResultSet rs = stmt.executeQuery(queryStr);
      if (rs.next()) {
        value = rs.getString("value");
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return value;
  }

  public static void main(String[] args) {
    String key = "L";
    String value = lookup(key);
    System.out.println(value);
  }
}