/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Timestamp;

/**
 *
 * @author Administrator
 */
public class bill {
    private long bill_id;
    private long user_id;
    private double total;
    private String payment;
    private String address;
    private Timestamp date;

    public bill() {
    }

    public bill(long bill_id, long user_id, double total, String payment, String address, Timestamp date) {
        this.bill_id = bill_id;
        this.user_id = user_id;
        this.total = total;
        this.payment = payment;
        this.address = address;
        this.date = date;
    }

    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
}
