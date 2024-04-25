package com.mycompany.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ivan_
 */
public class Clientes_File {
    // Declaración de variables/objetos para el archivo.
    RandomAccessFile raf = null;
    File file;
    private int n_reg;
    private int tam_per_re = 100;
    
    public Clientes_File(){
        try {
            // Asignación de las instancias.
            file = new File("Clientes_Hotel.obj");
            raf = new RandomAccessFile(file, "rw");
            try {
                n_reg = (int) Math.ceil((double) raf.length() / (double) tam_per_re);
            } catch (IOException ex) {}
        } catch (FileNotFoundException ex) {}
    }
    
    // Función para recuperar el ID consecutivo en el archivo "Clientes_Hotel".
    public int get_IdC() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x + 1;
    }
    
     public int get_ClCount() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x;
    }
    
    public Boolean Add_C (Clientes cl) throws IOException{
        if(Add_Cl(n_reg, cl)){
            n_reg++;
            return true;
        } else{
            return false;
        }
    }
    
    // Escribir un registro en el archivo "Usuario".
    public boolean Add_Cl(int i, Clientes cl) throws IOException {
        if (i >= 0 && i <= getN_reg()){
            if(cl.getTam() > tam_per_re) {
                return false;
            } else{
                raf.seek(i*tam_per_re);
                raf.writeInt(cl.getIDU());
                raf.writeUTF(cl.getNU());
                raf.writeUTF(cl.getDU());
                raf.writeUTF(cl.getTU());
                raf.writeUTF(cl.getEU());
                raf.writeUTF(cl.getESU());
                raf.close();
                return true;
            }
        } else{
            return false;
        }
    }

    // Lee y busca un registro en específico dentro del archivo.
    public int Search_Client(int ID) throws IOException{
        Clientes cl = new Clientes();
        int i;
        for(i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            cl = getCl(i);
            if(cl.getIDU() == ID){
                return i;
            }
        }
        return -1;
    }

    public Clientes getCl(int i) throws IOException{
        if(i >= 0 && i <= getN_reg()) {    
            raf.seek(i * tam_per_re);
            Clientes cl = new Clientes();
            cl.setIDU(raf.readInt());
            cl.setNU(raf.readUTF());
            cl.setDU(raf.readUTF());
            cl.setTU(raf.readUTF());
            cl.setEU(raf.readUTF());
            cl.setESU(raf.readUTF());
            return cl;
        } else{
            return null;
        }
    }
  
    public boolean Edit_Cl(Clientes cl) throws IOException{
        int pos = Search_Client(cl.getIDU());
        Clientes ncl = new Clientes();
        ncl = getCl(pos);
        if (ncl.getESU().equals("Inactivo")){
            return false;
        }
        ncl = cl;
        Add_Cl(pos, ncl);
        return true;
    }
    
    public boolean Delete_Client(int ID) throws IOException{
        int pos = Search_Client(ID);
        Clientes cl = new Clientes();
        cl = getCl(pos);
        if (cl.getESU().equals("Inactivo")){
            return false;
        }
        cl.setESU("Inactivo");
        Add_Cl(pos, cl);
        return true;
    }

    public int getN_reg() {
        return n_reg;
    }
}

