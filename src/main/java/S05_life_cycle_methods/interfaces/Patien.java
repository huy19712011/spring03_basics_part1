/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_life_cycle_methods.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 *
 * @author huynq
 */
public class Patien implements InitializingBean, DisposableBean {

    private int id;

    @Override
    public String toString() {
        return "Patien{" + "id=" + id + '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Inside the setter method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Inside afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Inside destroy()");
    }



}
