package com.jdbc;

import com.jdbc.DAO.JDBCDAO;
import java.sql.SQLException;
import java.util.ArrayList;


public class App
{
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    JDBCDAO jdbc = new JDBCDAO();
    
    jdbc.createTables();
    String data = jdbc.getLastDataEntryFromDevice(7);
    
    System.out.println("Data: " + data);
    
    ArrayList<Integer> info = new ArrayList<>();
    
    info = jdbc.getActFuncInfo(10, "turn_on");
    System.out.println("Device Addr: " + info.get(0));
    System.out.println("Func id: " + info.get(1));
  }
}