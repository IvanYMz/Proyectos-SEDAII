package MP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Client_File {
    private String url = "Clientes.txt";
    private String url2 = "Users.txt";
    private DataOutputStream write;
    private DataInputStream read;
    private ArrayList<Usuario> lst;
    Object [][] datos = new Object [100][10];
    
    public Client_File(){
        write = null;
        read = null;
        lst = new ArrayList<>();
    }
    
    // Asigna el ID en cada registro 
    public int get_IdC() throws FileNotFoundException{
        int id = 0, x = 0;
         try{
            String name = "", secname = "", sit = "", use = "";
            read = new DataInputStream(new FileInputStream(url));
            while(true && read.available() != 0){
                id = read.readInt();
                name = read.readUTF();
                secname = read.readUTF();
                sit = read.readUTF();
                use = read.readUTF();
                x++;
            }
        }catch(IOException ex){}
        return x + 1;
    }
    
    // Recupera el usuario que registró al cliente
    public ArrayList<Usuario> getUsuarios(){
        try {
            Usuario us;
            read = new DataInputStream( new FileInputStream(url2));
            while (true){
                us = new Usuario(); 
                us.setId(read.readInt());
                us.setName(read.readUTF());
                us.setSecName(read.readUTF());
                us.setPhone(read.readUTF());
                us.setUsername(read.readUTF());
                us.setAddress(read.readUTF());
                us.setPassword(read.readUTF());
                us.setPerfil(read.readUTF());
                us.setEstado(read.readUTF());
                this.lst.add(us);
            }
        } catch (IOException ex) {}
    return lst;
    }
    
    public void Save_Client(Cliente cl) throws IOException{
        try{
            write = new DataOutputStream (new FileOutputStream(url, true));
            write.writeInt(cl.getId());
            write.writeUTF(cl.getName());
            write.writeUTF(cl.getSecName());
            write.writeUTF(cl.getEstado());
            write.writeUTF(cl.getUsuario_R());
            write.close();
        }catch(FileNotFoundException ex){}
    }
    
    public Cliente Search_Cl(Cliente cl) throws IOException{
        try {
            read = new DataInputStream( new FileInputStream(url));
            int id = 0;
            String name = "", secname = "", sit = "", us = "";
            while (true){
                id = read.readInt();
                name = read.readUTF();
                secname = read.readUTF();
                sit = read.readUTF();
                us = read.readUTF();
                if (id == cl.getId()){
                    cl.setId(id);
                    cl.setName(name);
                    cl.setSecName(secname);
                    cl.setEstado(sit);
                    cl.setUsuario_R(us);
                    return cl;
                }
            }
        } catch (FileNotFoundException ex) {}
    return cl;
    } 
     
    public void Modificar_Cl(int Id, String nomb, String nomb2, String est, String us){
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
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = nomb;
                datos[x][2] = nomb2;
                datos[x][3] = est;
                datos[x][4] = us;
               
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
                x++;
            }
        } catch (IOException ex) {}
    }
    
    public void Eliminar_Cl(int Id){
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
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = datos[x][1];
                datos[x][2] = datos[x][2];
                datos[x][3] = "** ¡INACTIVO! **";
                datos[x][4] = datos[x][4];
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
                x++;
            }
        } catch (IOException ex) {}
    }
}
