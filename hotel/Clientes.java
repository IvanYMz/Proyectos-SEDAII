package com.mycompany.hotel;

/**
 *
 * @author ivan_
 */
public class Clientes {
    private int IDU;
    private String NU;
    private String DU;
    private String TU;
    private String EU;
    private String ESU;
    private int tam;

    public int getIDU() {
        return IDU;
    }

    public void setIDU(int IDU) {
        this.IDU = IDU;
    }

    public String getNU() {
        return NU;
    }

    public void setNU(String NU) {
        this.NU = NU;
    }

    public String getDU() {
        return DU;
    }

    public void setDU(String DU) {
        this.DU = DU;
    }

    public String getTU() {
        return TU;
    }

    public void setTU(String TU) {
        this.TU = TU;
    }

    public String getEU() {
        return EU;
    }

    public void setEU(String EU) {
        this.EU = EU;
    }

    public String getESU() {
        return ESU;
    }

    public void setESU(String ESU) {
        this.ESU = ESU;
    }
    
    public int getTam() {
        return (getNU().length() * 2 + 2) + (getDU().length() * 2 + 2) + (getTU().length() * 2 + 2) + (getEU().length() * 2 + 2)
                 + (getESU().length() * 2 + 2) + 4;
    }
}
