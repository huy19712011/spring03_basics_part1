/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_properties;

/**
 *
 * @author huynq
 */
public class MyDAO {

    private String dbServer;

    public MyDAO(String dbServer) {
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "MyDAO{" + "dbServer=" + dbServer + '}';
    }

    

}
