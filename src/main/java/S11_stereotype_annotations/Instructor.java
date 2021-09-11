/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_stereotype_annotations;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
//@Component
@Component
@Scope("prototype")
public class Instructor {

    //@Value("10")
    //@Value("#{56+44}")
    //@Value("#{T(java.lang.Math).abs(-99)}")
    //@Value("#{new Integer(90)}")
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private int id = 1;

    //@Value("Best Instructor")
    //@Value("#{'Best Instructor'}")
    //@Value("#{'Best Instructor'.toUpperCase()}")
    @Value("#{new java.lang.String('new instructor')}")
    private String name = "Instructor";

    @Value("#{topics}")
    private List<String> topics;

    @Autowired
    private Profile profile;

    //@Value("#{2+3>4}")
    @Value("#{2+3>8?true:false}")
    private boolean active;

    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active=" + active + '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
