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
public class Student {

    private Scores scores;

    @Override
    public String toString() {
        return "Student{" + "scores=" + scores + '}';
    }


    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }


}
