/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import Model.product;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author w7
 */
public class productDAL {
    public ArrayList<product> showAll(){
        ArrayList<product> list=new ArrayList<product>();
        try{
            Connection cnn=ConnectToDB.getConnection();
            Statement stm=cnn.createStatement();
            ResultSet rs=stm.executeQuery("SELECT * FROM product");
            while (rs.next()) {                
                long id = rs.getLong("product_id");
                long catid = rs.getLong("category_id");
                String name = rs.getString("product_name");
                String img = rs.getString("product_image");
                double price=rs.getDouble("product_price");
                String description = rs.getString("product_description");
                product p =new product(id, name, img, price, description,catid);
                list.add(p);
            }
        }catch(Exception ex){
            
        }
        return list;
    }
    public ArrayList<product> productOfCategory(long catid){
        ArrayList<product> list=new ArrayList<product>();
        try{
            Connection cnn=ConnectToDB.getConnection();
            PreparedStatement pstm = cnn.prepareStatement("SELECT * FROM product WHERE category_id=?");
            pstm.setLong(1, catid);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                long id = rs.getLong("product_id");
                long cat_id = rs.getLong("category_id");
                String name = rs.getString("product_name");
                String img = rs.getString("product_image");
                double price=rs.getDouble("product_price");
                String description = rs.getString("product_description");
                product p =new product(id, name, img, price, description,catid);
                list.add(p);
            }
        }catch(Exception ex){
            
        }
        return list;
    }
    public product productByProductID(long id){
        product p=null;
         try{
            Connection cnn=ConnectToDB.getConnection();
            PreparedStatement pstm = cnn.prepareStatement("SELECT * FROM product WHERE product_id=?");
            pstm.setLong(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {                
                long p_id = rs.getLong("product_id");
                long cat_id = rs.getLong("category_id");
                String name = rs.getString("product_name");
                String img = rs.getString("product_image");
                double price=rs.getDouble("product_price");
                String description = rs.getString("product_description");
                product x =new product(p_id, name, img, price, description,cat_id);
               p=x;
            }
        }catch(Exception ex){
            
        }
        return p;
    }
    
    
}
