/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_stereotype_annotations;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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

    }

}
