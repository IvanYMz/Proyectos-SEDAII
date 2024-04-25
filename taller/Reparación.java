package MP;

public class Reparación {
    private int ID_R;
    private int IDV_R;
    private int IDP_R;
    private String Date_In;
    private String Date_Out;
    private String Falla;
    private String estado;

    public int getID_R() {
        return ID_R;
    }

    public void setID_R(int ID_R) {
        this.ID_R = ID_R;
    }

    public int getIDV_R() {
        return IDV_R;
    }

    public void setIDV_R(int IDV_R) {
        this.IDV_R = IDV_R;
    }

    public int getIDP_R() {
        return IDP_R;
    }

    public void setIDP_R(int IDP_R) {
        this.IDP_R = IDP_R;
    }

    public String getDate_In() {
        return Date_In;
    }

    public void setDate_In(String Date_In) {
        this.Date_In = Date_In;
    }

    public String getDate_Out() {
        return Date_Out;
    }

    public void setDate_Out(String Date_Out) {
        this.Date_Out = Date_Out;
    }

    public String getFalla() {
        return Falla;
    }

    public void setFalla(String Falla) {
        this.Falla = Falla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
