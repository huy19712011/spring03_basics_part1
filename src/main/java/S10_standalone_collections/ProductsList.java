/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_standalone_collections;

import java.util.List;

/**
 *
 * @author huynq
 */
public class ProductsList {

    private List<String> productNames;

    @Override
    public String toString() {
        return "ProductsList{" + "productNames=" + productNames + '}';
    }

    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }


}
