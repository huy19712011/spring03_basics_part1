/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S04_SetterInjection.map;

import java.util.Map;

/**
 *
 * @author huynq
 */
public class Customer {

    private int id;
    private Map<Integer, String> products;

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", products=" + products + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }


}
