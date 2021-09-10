/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_constructor_injection;


/**
 *
 * @author huynq
 */
public class Employee {

    private int id;
    private Address address;

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", address=" + address + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
