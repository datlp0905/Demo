/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datlp.account;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DAT
 */
public class AccountDAO implements Serializable {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public AccountDAO() {
    }
    
    private void closeConnetion() throws SQLException {
        if(rs != null) {
            rs.close();
        }
        if(ps != null) {
            ps.close();
        }
        if(conn != null) {
            conn.close();
        }
    }
    
    public String checkLogin (String username, String password) throws ClassNotFoundException, SQLException {
        String role = "";
        try {
            conn = datlp.connection.MyConnection.getConnection();
            if(conn != null) {
                String sql = "Select Role From tblAccount Where Username = ? and Password = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if(rs.next()) {
                    role = rs.getString("Role");
                }
            }
        } finally {
            closeConnetion();
        }  
        return role;
    }
    
    public boolean signUp (String username, String fullname, String password) throws SQLException, ClassNotFoundException {
        int row = 0;
        try {
            conn = datlp.connection.MyConnection.getConnection();
            if(conn != null) {
                String sql = "Insert into tblAccount (Username,Fullname,Password) "
                        + "Values(?,?,?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, fullname);
                ps.setString(3, password);
                row = ps.executeUpdate();
            }
        } finally {
            closeConnetion();
        }
        return row == 1;
    }
}
