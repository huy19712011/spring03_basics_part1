/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_stereotype_annotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
//@Component
@Component("customName")
public class Instructor {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", name=" + name + '}';
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
