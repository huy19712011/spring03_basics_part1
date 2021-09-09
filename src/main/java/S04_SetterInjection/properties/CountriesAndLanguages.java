/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S04_SetterInjection.properties;

import java.util.Properties;

/**
 *
 * @author huynq
 */
public class CountriesAndLanguages {

    private Properties coutryAndLangs;

    @Override
    public String toString() {
        return "CountriesAndLanguages{" + "coutryAndLangs=" + coutryAndLangs + '}';
    }

    public Properties getCoutryAndLangs() {
        return coutryAndLangs;
    }

    public void setCoutryAndLangs(Properties coutryAndLangs) {
        this.coutryAndLangs = coutryAndLangs;
    }

    
}
