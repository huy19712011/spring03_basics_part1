/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_dependency_check.inner_beans;

/**
 *
 * @author huynq
 */
public class Employee {

    private int id;
    private Address address;

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
