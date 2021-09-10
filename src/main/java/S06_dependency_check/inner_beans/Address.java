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
class Address {

   private int hno;
   private String street;
   private String city;

    @Override
    public String toString() {
        return "Address{" + "hno=" + hno + ", street=" + street + ", city=" + city + '}';
    }

   public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
