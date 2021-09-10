/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_constructor_injection.ambiguity;

/**
 *
 * @author huynq
 */
public class Addition {


    public Addition(int a, double b) {

        System.out.println("inside constructor");

        System.out.println(a);
        System.out.println(b);
    }


}
