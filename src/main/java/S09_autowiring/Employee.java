/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S09_autowiring;



/**
 *
 * @author huynq
 */
public class Employee {

    private Address address;

    public Employee(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
