package com.mycompany.tienda;

public class Producto {
        private int ID_Pr;
        private String Name_Pr;
        private String Descr;
        private String Cat;
        private int Price;
        private int Stock;
        private String Vendor;
        private String Status;
        private String Foto; 
        private int tam;

        
    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getID_Pr() {
        return ID_Pr;
    }

    public void setID_Pr(int ID_Pr) {
        this.ID_Pr = ID_Pr;
    }

    public String getName_Pr() {
        return Name_Pr;
    }

    public void setName_Pr(String Name_Pr) {
        this.Name_Pr = Name_Pr;
    }

    public String getDescr() {
        return Descr;
    }

    public void setDescr(String Descr) {
        this.Descr = Descr;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
       
    public int getTam() {
        return (getName_Pr().length() * 2 + 2) + (getDescr().length() * 2 + 2) + (getStatus().length() * 2 + 2) + (getCat().length() * 2 + 2) + (getVendor().length() * 2 + 2) + (getFoto().length() * 2 + 2) + 4 + 4 + 4;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }
        
}
