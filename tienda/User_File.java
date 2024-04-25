package com.mycompany.tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class User_File {
    // Instancia de los objetos para crear archivos.
    RandomAccessFile raf = null;
    File file;
    private int n_reg;
    private int tam_per_re = 350;
    
    public User_File(){
        try {
            // Asignación de las instancias.
            file = new File("Usuario.obj");
            raf = new RandomAccessFile(file, "rw");
            try {
                n_reg = (int) Math.ceil((double) raf.length() / (double) tam_per_re);
            } catch (IOException ex) {}
        } catch (FileNotFoundException ex) {}
    }
    
    // Función para recuperar el ID consecutivo en el archivo "Usuario".
    public int get_IdC() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x + 1;
    }
    
    public void Add_C (Usuario us) throws IOException{
        if(Add_User(n_reg, us)){
            n_reg++;
        }
    }
    
    // Escribir un registro en el archivo "Usuario".
    public boolean Add_User(int i, Usuario us) throws IOException {
        if (i >= 0 && i <= getN_reg()){
            if(us.getTam() > tam_per_re) {
                return false;
            } else{
                raf.seek(i*tam_per_re);
                raf.writeInt(us.getID());
                raf.writeUTF(us.getName());
                raf.writeUTF(us.getLastName());
                raf.writeUTF(us.getNumber());
                raf.writeUTF(us.getAddres());
                raf.writeUTF(us.getUserName());
                raf.writeUTF(us.getPass());
                raf.writeUTF(us.getTypeUser());
                raf.writeUTF(us.getStatus());
                raf.close();
                return true;
            }
        } else{
            return false;
        }
    }
        
    //Lee y busca un registro en específico dentro del archivo.
    public int Search_User(int ID) throws IOException{
        Usuario us = new Usuario();
        int i;
        for(i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            us = getUs(i);
            if(us.getID() == ID){
                return i;
            }
        }
        return -1;
    }
    
    
    public Usuario Type_User(Usuario us){
        int Id = 0;
         try{
            String Nombre = "", Ape = "", Num = "", Dir = "", UserN = "", Pass = "", Tipo = "", Estado = "";
            while (true) {
               Id = raf.readInt();
               Nombre = raf.readUTF();
               Ape = raf.readUTF();
               Num = raf.readUTF();
               Dir = raf.readUTF();
               UserN = raf.readUTF();
               Pass = raf.readUTF();
               Tipo = raf.readUTF();
               Estado = raf.readUTF();
               if (us.getUserName().equals(UserN)){
                   us.setID(Id);
                   us.setName(Nombre);
                   us.setLastName(Ape);
                   us.setNumber(Num);
                   us.setAddres(Dir);
                   us.setUserName(UserN);
                   us.setPass(Pass);
                   us.setTypeUser(Tipo);
                   us.setStatus(Estado);
                   return us;
               }
            }
        }catch(IOException ex){}
        return us;
        
    }
      
    public int Search_Conf(String usn, String pass) throws IOException{
        Usuario us = new Usuario();
        int i;
        for(i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            us = getUs(i);
            if(us.getUserName().equals(usn) && us.getPass().equals(pass)){
                return i;
            }
        }
        return -1;
    }
 
    public Usuario getUs(int i) throws IOException{
        if(i >= 0 && i <= getN_reg()) {    
            raf.seek(i * tam_per_re);
            Usuario us = new Usuario();
            us.setID(raf.readInt());
            us.setName(raf.readUTF());
            us.setLastName(raf.readUTF());
            us.setNumber(raf.readUTF());
            us.setAddres(raf.readUTF());
            us.setUserName(raf.readUTF());
            us.setPass(raf.readUTF());
            us.setTypeUser(raf.readUTF());
            us.setStatus(raf.readUTF());
            return us;
        } else{
            return null;
        }
    }
  
    public boolean Edit_User(Usuario us) throws IOException{
        int pos = Search_User(us.getID());
        Usuario usn = new Usuario();
        usn = getUs(pos);
        if (usn.getStatus().equals("Inactivo")){
            return false;
        }
        usn = us;
        Add_User(pos, us);
        return true;
    }
    
    public boolean Delete_User(int ID) throws IOException{
        int pos = Search_User(ID);
        Usuario us = new Usuario();
        us = getUs(pos);
        if (us.getStatus().equals("Inactivo")){
            return false;
        }
        us.setStatus("Inactivo");
        Add_User(pos, us);
        return true;
    }

    public int Search_User2(String Usn) throws IOException{
        Usuario us = new Usuario();
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            us = getUs(i);
            if(us.getUserName().equals(Usn)){
                return i;
            }
        }
        return -1;
    }
    
    public int getN_reg() {
        return n_reg;
    }
}
