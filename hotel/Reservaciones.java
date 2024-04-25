
package com.mycompany.hotel;

/**
 *
 * @author ivan_
 */
public class Reservaciones {
    private int IDR;
    private int IDC;
    private int IDH;
    private int CR;
    private String InR;
    private String HR;
    private String FinR;
    private String ER;
    private int tam;

    public int getIDR() {
        return IDR;
    }

    public void setIDR(int IDR) {
        this.IDR = IDR;
    }

    public int getIDC() {
        return IDC;
    }

    public void setIDC(int IDC) {
        this.IDC = IDC;
    }

    public int getIDH() {
        return IDH;
    }

    public void setIDH(int IDH) {
        this.IDH = IDH;
    }

    public int getCR() {
        return CR;
    }

    public void setCR(int CR) {
        this.CR = CR;
    }

    public String getInR() {
        return InR;
    }

    public void setInR(String InR) {
        this.InR = InR;
    }

    public String getHR() {
        return HR;
    }

    public void setHR(String HR) {
        this.HR = HR;
    }

    public String getFinR() {
        return FinR;
    }

    public void setFinR(String FinR) {
        this.FinR = FinR;
    }
    
    public int getTam() {
        return (getInR().length() * 2 + 2) + (getHR().length() * 2 + 2) + (getFinR().length() * 2 + 2) + (getER().length() * 2 + 2) + 4 + 4 + 4 + 4;
    }

    public String getER() {
        return ER;
    }

    public void setER(String ER) {
        this.ER = ER;
    }
}
