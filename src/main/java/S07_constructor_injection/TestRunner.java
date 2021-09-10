/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_constructor_injection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public static void main(String[] args) throws IOException {

//        Path path = Paths.get("config.xml");
//        System.out.println(path);

//        // Create a file object
//            File f = new File("config.xml");
//
//            // Get the absolute path of file f
//            System.out.println(f.getAbsolutePath());

//    System.out.println(new File(".").getAbsolutePath());


        // put .xml file into src/main/resources folder

        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("constructor_injection_config.xml");

        Employee bean
                = ctx.getBean("employee", Employee.class);
        System.out.println(bean);







//        // works on both netbeans and eclipse
//        String path = "D:\\Projects\\Java\\javaSpring\\spring03_04_SetterInjection\\src\\main\\java\\S05_life_cycle_methods\\annotations\\annotations_config.xml";
//
//        // change to AbstractApplicationContext
//        AbstractApplicationContext context = new FileSystemXmlApplicationContext(path);
//        Patien bean
//                = context.getBean("patien", Patien.class);
//
//        System.out.println(bean);
//
//        // set to enable destroy method
//        context.registerShutdownHook();


    }

}
