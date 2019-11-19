/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howispentmoney;

import java.sql.Timestamp;

/**
 *
 * @author Thitiwut
 */
class Userdata {
    private Timestamp TIMESTAMP;
    private String TYPE, TYPE_DES;
    private double VALUE;
    
    public Userdata(Timestamp TIMESTAMP, String TYPE, String TYPE_DES, double VALUE){
        this.TIMESTAMP = TIMESTAMP;
        this.TYPE = TYPE;
        this.TYPE_DES = TYPE_DES;
        this.VALUE = VALUE;
    }

    public Timestamp getTIMESTAMP() {
        return TIMESTAMP;
    }

    public String getTYPE() {
        return TYPE;
    }

    public String getTYPE_DES() {
        return TYPE_DES;
    }

    public double getVALUE() {
        return VALUE;
    }
    
}
