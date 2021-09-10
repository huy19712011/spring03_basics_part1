/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S09_autowiring.annotations;

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

        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("autowiring_annotations_config.xml");

        Employee bean
                = ctx.getBean("employee", Employee.class);
        System.out.println(bean);

    }

}
