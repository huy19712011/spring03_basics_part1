/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S09_autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author huynq
 */
public class Employee {

    @Autowired(required = false)
    @Qualifier("address2")
    private Address address;

    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }

    public Address getAddress() {
        return address;
    }

    //@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }


}
