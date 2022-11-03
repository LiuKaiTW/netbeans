/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.registerfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Method {
    public void add(registerfile rf)
{ Connection conn=dbconnection.getDB();
  String sql="insert into user(username,password) values(?,?)";
  
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, rf.getUsername());
            ps.setString(2, rf.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}
    //這樣rf就可以使用rf.getusername跟rf.getpassword來判斷
    public registerfile queryId(int id) {
     registerfile rf=null;
     Connection conn=dbconnection.getDB();
     String Sql="select * from user where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {rf=new registerfile();
            rf.setUsername(rs.getString("username"));
            rf.setPassword(rs.getString("password"));
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
     return rf;
    }
    
    public List<registerfile> query2() {
    List<registerfile> l=new ArrayList();
    Connection conn=dbconnection.getDB();
    String Sql="select * from user";     
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {  registerfile rf=new registerfile();
                rf.setUsername(rs.getString("username"));
                rf.setPassword(rs.getString("password"));
                
                l.add(rf);
            }
            } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
               return l;
         
    }
    
    public registerfile queryId(String username) {
     registerfile rf=null;
     Connection conn=dbconnection.getDB();
     String Sql="select * from user where username=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1, username);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {rf=new registerfile();
            rf.setUsername(rs.getString("username"));
            rf.setPassword(rs.getString("password"));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
     return rf;
    }
    
    
     public String queryID1(String username)
     {         
        String show="";
        Connection conn=dbconnection.getDB();
        String Sql="select * from user where username=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
           ps.setString(1, username);
          
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                show=show+"帳號:"+rs.getString("username")+
                        "\n密碼:"+rs.getString("password");
                        
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return show;
     }
     
     public void update(registerfile rf) {
     Connection conn=dbconnection.getDB();
     String sql="update user set username=?,password=? where username=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,rf.getUsername());
            ps.setString(2,rf.getPassword());
            ps.setString(3,rf.getUsername());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
     
     public void delete(String username) {
    Connection conn=dbconnection.getDB();
    String Sql="delete from user where username=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1,username);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
