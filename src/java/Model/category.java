/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author w7
 */
public class category {
    
private long categoy_id;
private String category_name;

    public category() {
    }

    public category(long categoy_id, String category_name) {
        this.categoy_id = categoy_id;
        this.category_name = category_name;
    }

    public long getCategoy_id() {
        return categoy_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategoy_id(long categoy_id) {
        this.categoy_id = categoy_id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    
}
