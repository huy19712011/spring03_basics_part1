/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huynq
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("properties_config.xml");

        MyDAO bean = context.getBean("myDAO", MyDAO.class);
        System.out.println(bean);
    }

}
