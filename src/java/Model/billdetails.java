/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrator
 */
public class billdetails {
    private long bill_details_id;
    private long bill_id;
    private long product_id;
    private double price;
    private int quantity;

    public billdetails() {
    }

    public billdetails(long bill_details_id, long bill_id, long product_id, double price, int quantity) {
        this.bill_details_id = bill_details_id;
        this.bill_id = bill_id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }

    public long getBill_details_id() {
        return bill_details_id;
    }

    public void setBill_details_id(long bill_details_id) {
        this.bill_details_id = bill_details_id;
    }

    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
