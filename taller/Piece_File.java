package MP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Piece_File {
    private String url = "Piezas.txt";
    private DataOutputStream write;
    private DataInputStream read;
    Object [][] datos = new Object [100][10];
    
    public Piece_File(){
        write = null;
        read = null;
    }
    
    // Asigna el ID en cada registro 
    public int getPiece_Id() throws FileNotFoundException{
        int id = 0, stock = 0, x = 0;
        try{
            String descrip = "";
            read = new DataInputStream(new FileInputStream(url));
            while(true && read.available() != 0){
                id = read.readInt();
                stock = read.readInt();
                descrip = read.readUTF();
                x++;
            }
        }catch(IOException ex){}
        return x + 1;
    }
    
    // Agrega piezas 
    public void Save_Piece(Pieza pz) throws IOException{
        try{
            write = new DataOutputStream (new FileOutputStream(url, true));
            write.writeInt(pz.getID());
            write.writeInt(pz.getStock());
            write.writeUTF(pz.getDescr());
            write.close();
        }catch(FileNotFoundException ex){}
    }
    
    public Pieza Search_Piece(Pieza pz) throws IOException{
        try {
            read = new DataInputStream( new FileInputStream(url));
            int id = 0, stock = 0;
            String des = "";
            while (true){
                id = read.readInt();
                stock = read.readInt();
                des = read.readUTF();
                if (id == pz.getID()){
                    pz.setID(id);
                    pz.setStock(stock);
                    pz.setDescr(des);
                    return pz;
                }
            }
        } catch (FileNotFoundException ex) {}
    return pz;
    }
     
    public void Modificar(int Id, int St, String des){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = read.readInt();
                datos[cont][2] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = St;
                datos[x][2] = des;
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeInt(Integer.parseInt(datos [x][1].toString()));
                write.writeUTF(datos [x][2].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
    
    public void Eliminar(int Id){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = read.readInt();
                datos[cont][2] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = 0;
                datos[x][2] = datos[x][2];
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeInt(Integer.parseInt(datos [x][1].toString()));
                write.writeUTF(datos [x][2].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
    
    public void Descontar(int Id){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = (read.readInt() - 1);
                datos[cont][2] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = datos[x][1];
                datos[x][2] = datos[x][2];
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeInt(Integer.parseInt(datos [x][1].toString()));
                write.writeUTF(datos [x][2].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
}
