/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S04_SetterInjection.properties;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.context.ApplicationContext;
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
    public static void main(String[] args) throws IOException {

//        Path path = Paths.get("config.xml");
//        System.out.println(path);

//        // Create a file object
//            File f = new File("config.xml");
//
//            // Get the absolute path of file f
//            System.out.println(f.getAbsolutePath());


        // this works only on eclipse, not on netbeans???

//        ClassPathXmlApplicationContext ctx
//                = new ClassPathXmlApplicationContext("config.xml");
//
//        Employee emp = (Employee) ctx.getBean("emp");
//
//        System.out.println("Employee Id: " + emp.getId());
//        System.out.println("Employee Name: " + emp.getName());



        // works on both netbeans and eclipse
        String path = "D:\\Projects\\Java\\javaSpring\\spring03_04_SetterInjection\\src\\main\\java\\S04_SetterInjection\\properties\\properties-config.xml";

        ApplicationContext context = new FileSystemXmlApplicationContext(path);
        CountriesAndLanguages bean
                = context.getBean("countriesAndLanguages", CountriesAndLanguages.class);

        System.out.println("Type of properties: " + bean.getCoutryAndLangs().getClass());
        System.out.println("Properties: " + bean.getCoutryAndLangs());
        System.out.println(bean);

    }

}