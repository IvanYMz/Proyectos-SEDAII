package MP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Repairs_File {
    private String url = "Reparaciones.txt";
    private String url1 = "Vehículos.txt";
    private String url2 = "Piezas.txt";
    private DataOutputStream write;
    private DataInputStream read;
    private ArrayList<Vehículo> LstV;
    private ArrayList<Pieza> LstP;
    Object [][] datos = new Object [100][10];
    
    public Repairs_File(){
        write = null;
        read = null;
        LstV = new ArrayList<>();
        LstP = new ArrayList<>();
    }
    
    // Recupera el vehículo
    public ArrayList<Vehículo> getVehicle(){
        try {
            Vehículo ve;
            read = new DataInputStream( new FileInputStream(url1));
            while (true){
                ve = new Vehículo();
                ve.setID(read.readInt());
                ve.setMatrícula(read.readUTF());
                ve.setMarca(read.readUTF());
                ve.setModelo(read.readUTF());
                ve.setEstado(read.readUTF());
                ve.setCliente(read.readUTF());
                ve.setFecha(read.readUTF());
                this.LstV.add(ve);
            }
        } catch (IOException ex) {}
    return LstV;
    }
    
     // Recupera piezas
    public ArrayList<Pieza> getPiece(){
        try {
            Pieza pi;
            read = new DataInputStream( new FileInputStream(url2));
            while (true){
                pi = new Pieza();
                pi.setID(read.readInt());
                pi.setStock(read.readInt());
                pi.setDescr(read.readUTF());
                this.LstP.add(pi);
            }
        } catch (IOException ex) {}
    return LstP;
    }
    
    // Asigna el ID en cada registro 
    public int get_IdR() throws FileNotFoundException{
        int id = 0, id2 = 0, id3 = 0, x = 0;
         try{
            String f_i = "", f_n = "", falla = "", estado = "";
            read = new DataInputStream(new FileInputStream(url));
            while(true && read.available() != 0){
                id = read.readInt();
                id2 = read.readInt();
                id3 = read.readInt();
                f_i = read.readUTF();
                f_n = read.readUTF();
                falla = read.readUTF();
                estado = read.readUTF();
                x++;
            }
        }catch(IOException ex){}
        return x + 1;
    }
    
    public void Save_Rep(Reparación re) throws IOException{
        try{
            write = new DataOutputStream (new FileOutputStream(url, true));
            write.writeInt(re.getID_R());
            write.writeInt(re.getIDP_R());
            write.writeInt(re.getIDV_R());
            write.writeUTF(re.getDate_In());
            write.writeUTF(re.getFalla());
            write.writeUTF(re.getDate_Out());
            write.writeUTF(re.getEstado());
            write.close();
        }catch(FileNotFoundException ex){}
    }
    
    public Reparación Search_R(Reparación re) throws IOException{
        try {
            read = new DataInputStream( new FileInputStream(url));
            int id = 0, id2 = 0, id3 = 0, x = 0;
            String f_i = "", f_n = "", falla = "", estado = "";
            while (true){
                id = read.readInt();
                id2 = read.readInt();
                id3 = read.readInt();
                f_i = read.readUTF();
                f_n = read.readUTF();
                falla = read.readUTF();
                estado = read.readUTF();
                if (id == re.getID_R()){
                    re.setID_R(id);
                    re.setIDV_R(id2);
                    re.setIDP_R(id3);
                    re.setDate_In(f_i);
                    re.setDate_Out(f_n);
                    re.setFalla(falla);
                    re.setEstado(estado);
                    return re;
                }
            }
        } catch (FileNotFoundException ex) {}
    return re;
    }
    
    public void Modificar_R(int Id, int Id1, int Id2, String D_In, String D_Out, String Falla, String Estado){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = read.readInt();
                datos[cont][2] = read.readInt();
                datos[cont][3] = read.readUTF();
                datos[cont][4] = read.readUTF();
                datos[cont][5] = read.readUTF();
                datos[cont][6] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = Id1;
                datos[x][2] = Id2;
                datos[x][3] = D_In;
                datos[x][4] = D_Out;
                datos[x][5] = Falla;
                datos[x][6] = Estado;
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeInt(Integer.parseInt(datos [x][1].toString()));
                write.writeInt(Integer.parseInt(datos [x][2].toString()));
                write.writeUTF(datos [x][3].toString());
                write.writeUTF(datos [x][4].toString());
                write.writeUTF(datos [x][5].toString());
                write.writeUTF(datos [x][6].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
    
     public void Eliminar_R(int Id){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = read.readInt();
                datos[cont][2] = read.readInt();
                datos[cont][3] = read.readUTF();
                datos[cont][4] = read.readUTF();
                datos[cont][5] = read.readUTF();
                datos[cont][6] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = datos[x][1];
                datos[x][2] = datos[x][2];
                datos[x][3] = datos[x][3];
                datos[x][4] = datos[x][4];
                datos[x][5] = datos[x][5];
                datos[x][6] = "**Inactivo**";
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeInt(Integer.parseInt(datos [x][1].toString()));
                write.writeInt(Integer.parseInt(datos [x][2].toString()));
                write.writeUTF(datos [x][3].toString());
                write.writeUTF(datos [x][4].toString());
                write.writeUTF(datos [x][5].toString());
                write.writeUTF(datos [x][6].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
}
