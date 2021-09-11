/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S13_interface_injection;

/**
 *
 * @author huynq
 */
public class OrderBOImpl implements OrderBO {

    private OrderDAO dao;

    @Override
    public void placeOrder() {

        System.out.println("inside Order BO");

        dao.createOrder();
    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }



}
