/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_stereotype_annotations;

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
                = new ClassPathXmlApplicationContext("S11_stereotype_annotations_config.xml");

        Instructor bean
                = ctx.getBean("instructor", Instructor.class);
        System.out.println(bean);

        Instructor bean2
                = ctx.getBean("instructor", Instructor.class);
        System.out.println(bean2);



    }

}
