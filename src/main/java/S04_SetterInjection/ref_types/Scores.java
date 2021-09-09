/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S04_SetterInjection.ref_types;

/**
 *
 * @author huynq
 */
public class Scores {

    private Double maths;
    private Double physics;
    private Double chemistries;

    @Override
    public String toString() {
        return "Scores{" + "maths=" + maths + ", physics=" + physics + ", chemystries=" + chemistries + '}';
    }

    

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public Double getChemistries() {
        return chemistries;
    }

    public void setChemistries(Double chemistries) {
        this.chemistries = chemistries;
    }




}
