package com.mycompany.tienda;

public class Usuario {
    private int ID;
    private String Name;
    private String LastName;
    private String Number;
    private String Addres;
    private String UserName;
    private String Pass;
    private String TypeUser;
    private String Status;
    private int tam;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getTypeUser() {
        return TypeUser;
    }

    public void setTypeUser(String TypeUser) {
        this.TypeUser = TypeUser;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getTam() {
        return (getName().length() * 2 + 2) + (getLastName().length() * 2 + 2) + (getNumber().length() * 2 + 2) + (getAddres().length() * 2 + 2)
                 + (getUserName().length() * 2 + 2) + (getTypeUser().length() * 2 + 2) + (getPass().length() * 2 + 2) + (getStatus().length() * 2 + 2) + 4;
    }
}
