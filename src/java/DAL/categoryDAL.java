/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import Model.category;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author w7
 */
public class categoryDAL {
    public ArrayList<category> showAll(){
        ArrayList<category> list=new  ArrayList<>();
        Connection cnn=ConnectToDB.getConnection();
        try{
        Statement st = cnn.createStatement();
        ResultSet rss=st.executeQuery("SELECT * FROM category");
            while (rss.next()) {
                long id=rss.getLong("category_id");
                String name=rss.getString("category_name");
                category c=new category(id, name);
                list.add(c);
            }
        }catch(Exception ex){
            System.err.println("Lỗi: "+ex.toString());
        }
        return list;
    }
    public static void main(String[] args) {
        categoryDAL m=new categoryDAL();
        for(category x : m.showAll())
        System.out.println(x.getCategory_name());
    }
}
