/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howispentmoney;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Thitiwut
 */
class Userdata {
    private Date TIMESTAMP;
    private String TYPE, TYPE_DES;
    private double VALUE;
    
    public Userdata(Date TIMESTAMP, String TYPE, String TYPE_DES, double VALUE){
        this.TIMESTAMP = TIMESTAMP;
        this.TYPE = TYPE;
        this.TYPE_DES = TYPE_DES;
        this.VALUE = VALUE;
    }

    public Date getTIMESTAMP() {
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
