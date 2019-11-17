/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import Model.user;
/**
 *
 * @author w7
 */
public class userDAL {
    public boolean checkEmail(String email) {
        Connection cnn = ConnectToDB.getConnection();
        try {
            PreparedStatement pstm = cnn.prepareStatement("SELECT * FROM users WHERE user_email=?");
            pstm.setString(1, email);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                cnn.close();
                return true;
            }
        } catch (Exception ex) {
        }
        return false;
    }
    public boolean insertUser(user khachhang){
        Connection cnn = ConnectToDB.getConnection();
        try{
            PreparedStatement pstm = cnn.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
            pstm.setLong(1, khachhang.getUser_id());
            pstm.setString(2,khachhang.getUser_fullname());
            pstm.setString(3,khachhang.getUser_email());
            pstm.setString(4,khachhang.getUser_pass());
            int x = pstm.executeUpdate();
            if(x>0)
                return true;
        }catch(Exception ex){
            
        }
        return false;
    }
    public user login(String email, String password){
        Connection cnn=ConnectToDB.getConnection();
        try{
            PreparedStatement pstm = cnn.prepareStatement("SELECT * FROM users WHERE user_email=? and user_pass=?");
            pstm.setString(1, email);
            pstm.setString(2, password);
            ResultSet rss = pstm.executeQuery();
            if(rss.next()){
                user kh = new user();
                kh.setUser_id(rss.getLong("user_id"));
                kh.setUser_email(rss.getString("user_email"));
                kh.setUser_fullname(rss.getString("user_fullname"));
                return kh;
            }
        }catch(Exception ex){
            
        }
        return null;
    }
}
