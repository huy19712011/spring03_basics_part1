/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_stereotype_annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
class Profile {

    @Value("Java Instructor")
    private String title;

    @Value("My company")
    private String company;

    @Override
    public String toString() {
        return "Profile{" + "title=" + title + ", company=" + company + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



}
