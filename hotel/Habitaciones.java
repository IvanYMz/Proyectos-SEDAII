package com.mycompany.hotel;

import java.io.Serializable;

/**
 *
 * @author ivan_
 */
public class Habitaciones implements Serializable{
    private int NH;
    private String EH;

    public int getNH() {
        return NH;
    }

    public void setNH(int NH) {
        this.NH = NH;
    }

    public String getEH() {
        return EH;
    }

    public void setEH(String EH) {
        this.EH = EH;
    }
}
