/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_life_cycle_methods.xml_config;

/**
 *
 * @author huynq
 */
public class Patien {

    private int id;

    public void init456() {
        System.out.println("Inside init456 method");
    }

    public void destroy789() {
        System.out.println("inside destroy789 method");
    }

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



}
