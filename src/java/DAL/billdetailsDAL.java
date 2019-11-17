/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import Model.billdetails;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class billdetailsDAL {
    public boolean insert(billdetails cthoadon){
        Connection cnn = ConnectToDB.getConnection();
        try{
            PreparedStatement pstm = cnn.prepareStatement("INSERT INTO bill_detail VALUES(?,?,?,?,?)");
            pstm.setLong(1, cthoadon.getBill_details_id());
            pstm.setLong(2, cthoadon.getBill_id());
            pstm.setLong(3, cthoadon.getProduct_id());
            pstm.setDouble(4, cthoadon.getPrice());
            pstm.setInt(5, cthoadon.getQuantity());
            int i = pstm.executeUpdate();
            if(i>0)
                return true;
        }catch(Exception ex){
            
        }
        return false;
    }
    public ArrayList<billdetails> billDetailsByBillId(long id){
        ArrayList<billdetails> list = new ArrayList<billdetails>();
        Connection cnn = ConnectToDB.getConnection();
        try{
            PreparedStatement pstm = cnn.prepareStatement("SELECT * FROM bill_detail WHERE bill_id=?");
            pstm.setLong(1, id);
            ResultSet rss = pstm.executeQuery();
            while(rss.next()){
                billdetails c = new billdetails();
                c.setBill_details_id(rss.getLong("bill_detail_id"));
                c.setBill_id(rss.getLong("bill_id"));
                c.setProduct_id(rss.getLong("product_id"));
                c.setPrice(rss.getDouble("price"));
                c.setQuantity(rss.getInt("quantity"));
                list.add(c);
            }
        }catch(Exception e){
            
        }
        return list;
    }
}
