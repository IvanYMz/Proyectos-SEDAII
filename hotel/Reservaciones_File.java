package com.mycompany.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * @author ivan_
 */
public class Reservaciones_File {
    RandomAccessFile raf = null;
    File file;
    private int n_reg;
    private int tam_per_re = 130;
    
    public Reservaciones_File(){
        try {
            file = new File("Reservaciones_Hotel.obj");
            raf = new RandomAccessFile(file, "rw");
            n_reg = (int) Math.ceil((double) raf.length() / (double) tam_per_re);
        } catch (FileNotFoundException ex) {} catch (IOException ex) {}
    }
    
    // Función para recuperar el ID consecutivo en el archivo "Clientes_Hotel".
    public int get_IdR() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x + 1;
    }
    
    public int get_ReCount() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x;
    }
    
    public Boolean Add_RE (Reservaciones re) throws IOException{
        if(Add_RE(n_reg, re)){
            n_reg++;
            return true;
        } else{
            return false;
        }
    }
    
    // Escribir un registro en el archivo "Usuario".
    private boolean Add_RE(int i, Reservaciones re) throws IOException {
        if (i >= 0 && i <= getN_reg()){
            if(re.getTam() > tam_per_re) {
                return false;
            } else{
                raf.seek(i*tam_per_re);
                raf.writeInt(re.getIDR());
                raf.writeInt(re.getIDC());
                raf.writeInt(re.getIDH());
                raf.writeInt(re.getCR());
                raf.writeUTF(re.getInR());
                raf.writeUTF(re.getHR());
                raf.writeUTF(re.getFinR());
                raf.writeUTF(re.getER());
                raf.close();
                return true;
            }
        } else{
            return false;
        }
    }

    // Lee y busca un registro en específico dentro del archivo.
    public int Search_RE(int ID) throws IOException{
        Reservaciones re = new Reservaciones();
        int i;
        for(i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            re = getRE(i);
            if(re.getIDR()== ID){
                return i;
            }
        }
        return -1;
    }

    public Reservaciones getRE(int i) throws IOException{
        if(i >= 0 && i <= getN_reg()) {    
            raf.seek(i * tam_per_re);
            Reservaciones re = new Reservaciones();
            re.setIDR(raf.readInt());
            re.setIDC(raf.readInt());
            re.setIDH(raf.readInt());
            re.setCR(raf.readInt());
            re.setInR(raf.readUTF());
            re.setHR(raf.readUTF());
            re.setFinR(raf.readUTF());
            re.setER(raf.readUTF());
            return re;
        } else{
            return null;
        }
    }
  
    public boolean Edit_RE(Reservaciones re) throws IOException{
        int pos = Search_RE(re.getIDR());
        Reservaciones nre = new Reservaciones();
        nre = getRE(pos);
        if (nre.getER().equals("Cancelada")){
            return false;
        }
        nre = re;
        Add_RE(pos, nre);
        return true;
    }
    
    public boolean Delete_RE(int ID) throws IOException{
        int pos = Search_RE(ID);
        Reservaciones re = new Reservaciones();
        re = getRE(pos);
        if (re.getER().equals("Cancelada")){
            return false;
        }
        re.setER("Cancelada");
        Add_RE(pos, re);
        return true;
    }

    public int getN_reg() {
        return n_reg;
    }
}
