package com.jdbc.DAO;

import com.jdbc.util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class JDBCDAO
{
  public void createTables() throws ClassNotFoundException, SQLException {
    Connection conn = JDBCUtil.getConnection();
    
    Statement stmt = conn.createStatement();
    
    String sql_drop_data_table = "DROP TABLE IF EXISTS Data";
    String sql_drop_func_table = "DROP TABLE IF EXISTS Func";
    
    stmt.executeUpdate(sql_drop_data_table);
    stmt.executeUpdate(sql_drop_func_table);
    
    String sql_data_table = "CREATE TABLE Data (ID int PRIMARY KEY AUTO_INCREMENT, value VARCHAR(255), id_device INT, id_capability INT)";
    String sql_func_table = "CREATE TABLE Func (ID int PRIMARY KEY AUTO_INCREMENT, id_device INT, device_addr INT, func_name VARCHAR(255), id_func INT)";
    
    stmt.executeUpdate(sql_data_table);
    stmt.executeUpdate(sql_func_table);
    
    String sql_insert_data_1 = "INSERT INTO Data (value, id_device, id_capability) VALUES ('30', 7, 2);";
    String sql_insert_data_2 = "INSERT INTO Data (value, id_device, id_capability) VALUES ('1', 8, 3);";
    String sql_insert_data_3 = "INSERT INTO Data (value, id_device, id_capability) VALUES ('0', 9, 4);";
    String sql_insert_data_4 = "INSERT INTO Data (value, id_device, id_capability) VALUES ('20', 7, 2);";
    String sql_insert_data_5 = "INSERT INTO Data (value, id_device, id_capability) VALUES ('30', 7, 2);";
    
    stmt.executeUpdate(sql_insert_data_1);
    stmt.executeUpdate(sql_insert_data_2);
    stmt.executeUpdate(sql_insert_data_3);
    stmt.executeUpdate(sql_insert_data_4);
    stmt.executeUpdate(sql_insert_data_5);
    
    String sql_insert_func_1 = "INSERT INTO Func (id_device, device_addr, func_name, id_func) VALUES (10, 155, 'turn_on', 1)";
    String sql_insert_func_2 = "INSERT INTO Func (id_device, device_addr, func_name, id_func) VALUES (10, 155, 'turn_off', 2)";
    
    stmt.executeUpdate(sql_insert_func_1);
    stmt.executeUpdate(sql_insert_func_2);
    
    System.out.println("Tables created and data inserted...");
    
    conn.close();
  }

  public String getLastDataEntryFromDevice(int deviceID) throws ClassNotFoundException, SQLException {
    Connection conn = JDBCUtil.getConnection();
    
    String sql = "SELECT value FROM Data WHERE id_device=? ORDER BY id DESC LIMIT 1";
    
    PreparedStatement stmt = null;
    
    stmt = conn.prepareStatement(sql);
    stmt.setLong(1, deviceID);
    
    ResultSet rs = stmt.executeQuery();
    
    if (rs.next()) {
      String value = rs.getString("value");
      conn.close();
      return value;
    } 
    conn.close();
    return null;
  }

  public ArrayList<Integer> getActFuncInfo(int deviceID, String funcName) throws ClassNotFoundException, SQLException {
    ArrayList<Integer> info = new ArrayList<>();

     Connection conn = JDBCUtil.getConnection();
     
     String sql = "SELECT device_addr, id_func FROM Func WHERE id_device=? AND func_name=?";
     PreparedStatement stmt = null;
     
     stmt = conn.prepareStatement(sql);
     stmt.setLong(1, deviceID);
     stmt.setString(2, funcName);
     
     ResultSet rs = stmt.executeQuery();
     
     if (rs.next()) {
       int device_addr = rs.getInt("device_addr");
       int id_func = rs.getInt("id_func");
       
       info.add(Integer.valueOf(device_addr));
       info.add(Integer.valueOf(id_func));
       
       conn.close();
       return info;
     } 
     conn.close();
     return null;
   }
 }