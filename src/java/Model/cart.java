/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class cart {
    private ArrayList<cartItem> gioHang;
    public cart(){
        gioHang = new ArrayList<cartItem>();
    }
    public ArrayList<cartItem> getCart(){
        return gioHang;
    }
    public void addToCart(cartItem item){
        int i = gioHang.indexOf(item);
        if(i != -1){
            cartItem p = gioHang.get(i);
            int sl = p.getQuantity();
            p.setQuantity(++sl);
            gioHang.set(i, p);
        }else{
           gioHang.add(item);
        }
    }
    public void updateCart(long id, int sl){
       for(cartItem x : gioHang){
           if(x.getProductId()==id)
           {
               if(sl>0)
                   x.setQuantity(sl);
               else
                   gioHang.remove(x);
               break;
           }
       }
    }
    public void removeItem(cartItem p){
        boolean check = gioHang.contains(p);
        if(check)
            gioHang.remove(p);
    }
    public int countItem(){
        int i = 0;
        for(cartItem x : gioHang)
            i+=x.getQuantity();
        return i;
    } 
    public double total(){
        double tt = 0;
        for(cartItem item : gioHang)
            tt += item.total();
        return tt;
    }
}
