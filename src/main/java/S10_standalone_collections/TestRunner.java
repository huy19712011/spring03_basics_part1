/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_standalone_collections;

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
                = new ClassPathXmlApplicationContext("products_list_config.xml");

        ProductsList bean
                = ctx.getBean("productsList", ProductsList.class);

        System.out.println(bean);
        System.out.println("Type of list: " + bean.getProductNames().getClass());

    }

}
