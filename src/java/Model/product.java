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
public class product {
    private long product_id;
    private String product_name;
    private String product_image;
    private double product_price;
    private String product_description;
    private long category_id;
    public product() {
    }
    public product(long product_id, String product_name, String product_image, double product_price, String product_description, long category_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_image = product_image;
        this.product_price = product_price;
        this.product_description = product_description;
        this.category_id = category_id;
    }
    public long getProduct_id() {
        return product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public String getProduct_image() {
        return product_image;
    }
    public double getProduct_price() {
        return product_price;
    }
    public String getProduct_description() {
        return product_description;
    }
    public long getCategory_id() {
        return category_id;
    }
    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }
}
