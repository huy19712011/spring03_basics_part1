/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S13_interface_injection;

import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

    @Override
    public void createOrder() {

        System.out.println("Inside OrderDAOImpl2 createOrder()");
    }

}
