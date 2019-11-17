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
public class user {
    private long user_id;
    private String user_fullname;
    private String user_email;
    private String user_pass;

    public user() {
    }

    public user(long user_id, String user_fullname, String user_email, String user_pass) {
        this.user_id = user_id;
        this.user_fullname = user_fullname;
        this.user_email = user_email;
        this.user_pass = user_pass;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getUser_fullname() {
        return user_fullname;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setUser_fullname(String user_fullname) {
        this.user_fullname = user_fullname;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
    
}
