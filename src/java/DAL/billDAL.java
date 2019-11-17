/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import Model.bill;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class billDAL {
    public boolean insert(bill donhang){
        Connection cnn = ConnectToDB.getConnection();
        try{
            PreparedStatement pstm = cnn.prepareStatement("INSERT INTO bill VALUES(?,?,?,?,?,?)");
            pstm.setLong(1, donhang.getBill_id());
            pstm.setLong(2, donhang.getUser_id());
            pstm.setDouble(3, donhang.getTotal());
            pstm.setString(4, donhang.getPayment());
            pstm.setString(5, donhang.getAddress());
            pstm.setTimestamp(6, donhang.getDate());
            int i = pstm.executeUpdate();
            if(i>0)
                return true;
        }catch(Exception ex){
            
        }
        return false;
    }
    public ArrayList<bill> billByUserId(long id){
        ArrayList<bill> list = new ArrayList<bill>();
        Connection cnn = ConnectToDB.getConnection();
        try{
            PreparedStatement pstm = cnn.prepareStatement("SELECT * FROM bill WHERE user_id=?");
            pstm.setLong(1, id);
            ResultSet rss = pstm.executeQuery();
            while(rss.next()){
                bill hd = new bill();
                hd.setBill_id(rss.getLong("bill_id"));
                hd.setUser_id(rss.getLong("user_id"));
                hd.setTotal(rss.getDouble("total"));
                hd.setPayment(rss.getString("payment"));
                hd.setAddress(rss.getString("address"));
                hd.setDate(rss.getTimestamp("date"));
                list.add(hd);
            }
        }catch(Exception ex){
            
        }
        return list;
    }
}
