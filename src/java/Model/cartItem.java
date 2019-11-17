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
public class cartItem {
    private long productId;
    private String ProductName;
    private String ProductImage;
    private int quantity;
    private double price;
    public double total(){
        return quantity * price;
    }
    public cartItem() {
    }
    public cartItem(long productId, String ProductName,String ProductImage, int quantity, double price) {
        this.productId = productId;
        this.ProductName = ProductName;
        this.ProductImage = ProductImage;
        this.quantity = quantity;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductImage() {
        return ProductImage;
    }
    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cartItem other = (cartItem) obj;
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }
    
}
