package MP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Vehicle_File {
    private String url = "Vehículos.txt";
    private String url2 = "Clientes.txt";
    private DataOutputStream write;
    private DataInputStream read;
    private ArrayList<Cliente> LstC;
    Object [][] datos = new Object [100][10];
    
    public Vehicle_File (){
        write = null;
        read = null;
        LstC = new ArrayList<>();
    }
    
    // Recupera el cliente al que fue asignado el vehículo
    public ArrayList<Cliente> getCliente(){
        try {
            Cliente cl;
            read = new DataInputStream( new FileInputStream(url2));
            while (true){
                cl = new Cliente(); 
                cl.setId(read.readInt());
                cl.setName(read.readUTF());
                cl.setSecName(read.readUTF());
                cl.setEstado(read.readUTF());
                cl.setUsuario_R(read.readUTF());
                this.LstC.add(cl);
            }
        } catch (IOException ex) {}
    return LstC;
    }
    
    // Asigna el ID en cada registro 
    public int get_IdV() throws FileNotFoundException{
        int id = 0, x = 0;
         try{
            String client = "", matr = "", marcaV = "", mode = "", est = "", date = "";
            read = new DataInputStream(new FileInputStream(url));
            while(true && read.available() != 0){
                id = read.readInt();
                client = read.readUTF();
                matr = read.readUTF();
                marcaV = read.readUTF();
                mode = read.readUTF();
                est = read.readUTF();
                date = read.readUTF();
                x++;
            }
        }catch(IOException ex){}
        return x + 1;
    }
    
    public void Save_Vehilce(Vehículo ve) throws IOException{
        try{
            write = new DataOutputStream (new FileOutputStream(url, true));
            write.writeInt(ve.getID());
            write.writeUTF(ve.getCliente());
            write.writeUTF(ve.getMatrícula());
            write.writeUTF(ve.getMarca());
            write.writeUTF(ve.getModelo());
            write.writeUTF(ve.getEstado());
            write.writeUTF(ve.getFecha());
            write.close();
        }catch(FileNotFoundException ex){}
    }
    
    public Vehículo Search_V(Vehículo ve) throws IOException{
        try {
            read = new DataInputStream( new FileInputStream(url));
            int id = 0;
            String client = "", matr = "", marcaV = "", mode = "", est = "", date = "";
            while (true){
                id = read.readInt();
                client = read.readUTF();
                matr = read.readUTF();
                marcaV = read.readUTF();
                mode = read.readUTF();
                est = read.readUTF();
                date = read.readUTF();
                if (id == ve.getID()){
                    ve.setID(id);
                    ve.setCliente(client);
                    ve.setMatrícula(matr);
                    ve.setMarca(marcaV);
                    ve.setModelo(mode);
                    ve.setEstado(est);
                    ve.setFecha(date);
                    return ve;
                }
            }
        } catch (FileNotFoundException ex) {}
    return ve;
    }
    
    public void Modificar_V(int Id, String client, String matr, String marcaV, String mode, String est, String date){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = read.readUTF();
                datos[cont][2] = read.readUTF();
                datos[cont][3] = read.readUTF();
                datos[cont][4] = read.readUTF();
                datos[cont][5] = read.readUTF();
                datos[cont][6] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = client;
                datos[x][2] = matr;
                datos[x][3] = marcaV;
                datos[x][4] = mode;
                datos[x][5] = est;
                datos[x][6] = date;
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeUTF(datos [x][1].toString());
                write.writeUTF(datos [x][2].toString());
                write.writeUTF(datos [x][3].toString());
                write.writeUTF(datos [x][4].toString());
                write.writeUTF(datos [x][5].toString());
                write.writeUTF(datos [x][6].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
    
    public void Delete_V(int Id){
        int x = 0, cont = 0;
        Boolean ban = false;
        try {
            read = new DataInputStream(new FileInputStream(url));
        } catch (FileNotFoundException ex) {}
        try {
            while(true){
                datos[cont][0] = read.readInt();
                datos[cont][1] = read.readUTF();
                datos[cont][2] = read.readUTF();
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
                datos[x][5] = "** ¡INACTIVO! **";
                datos[x][6] = datos[x][6];
            }
            x++;
        }
        try {
            x = 0;
            write = new DataOutputStream (new FileOutputStream(url));
            while(x < cont){
                write.writeInt(Integer.parseInt(datos[x][0].toString()));
                write.writeUTF(datos [x][1].toString());
                write.writeUTF(datos [x][2].toString());
                write.writeUTF(datos [x][3].toString());
                write.writeUTF(datos [x][4].toString());
                write.writeUTF(datos [x][5].toString());
                write.writeUTF(datos [x][6].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
}
