/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S13_interface_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huynq
 */
public class TestRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // put .xml file into src/main/resources folder

        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("S13_interface_injecting_config.xml");

        OrderBO bean
                = ctx.getBean("bo", OrderBO.class);

        bean.placeOrder();


    }

}
