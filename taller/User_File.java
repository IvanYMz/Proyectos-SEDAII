package MP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class User_File {
    private String url = "Users.txt";
    private DataOutputStream write;
    private DataInputStream read;
    Object [][] datos = new Object [100][10];
    
    public User_File(){
        write = null;
        read = null;
    }
    
    // Asigna el ID en cada registro 
    public int getUser_Id() throws FileNotFoundException{
        int id = 0, x = 0;
        try{
            String name = "", secname = "", addres = "", phone = "", user = "", pass = "", profile = "", sit = "";
            read = new DataInputStream(new FileInputStream(url));
            while(true && read.available() != 0){
                id = read.readInt();
                name = read.readUTF();
                secname = read.readUTF();
                phone = read.readUTF();
                addres = read.readUTF();
                user = read.readUTF();
                pass = read.readUTF();
                profile = read.readUTF();
                sit = read.readUTF();
                x++;
            }
        }catch(IOException ex){}
        return x + 1;
    }
    
    // Agrega usuarios 
    public void Save_User(Usuario us) throws IOException{
        try{
            write = new DataOutputStream (new FileOutputStream(url, true));
            write.writeInt(us.getId());
            write.writeUTF(us.getName());
            write.writeUTF(us.getSecName());
            write.writeUTF(us.getPhone());
            write.writeUTF(us.getAddress());
            write.writeUTF(us.getUsername());
            write.writeUTF(us.getPassword());
            write.writeUTF(us.getPerfil());
            write.writeUTF(us.getEstado());
            write.close();
        }catch(FileNotFoundException ex){}
    }
    
    public Usuario Search_User(Usuario us) throws IOException{
        try {
            read = new DataInputStream( new FileInputStream(url));
            int id = 0;
            String name = "", secname = "", addres = "", phone = "", user = "", pass = "", profile = "", sit = "";
            while (true){
                id = read.readInt();
                name = read.readUTF();
                secname = read.readUTF();
                phone = read.readUTF();
                addres = read.readUTF();
                user = read.readUTF();
                pass = read.readUTF();
                profile = read.readUTF();
                sit = read.readUTF();
                if (id == us.getId()){
                    us.setId(id);
                    us.setName(name);
                    us.setSecName(secname);
                    us.setPhone(phone);
                    us.setAddress(addres);
                    us.setUsername(user);
                    us.setPassword(pass);
                    us.setPerfil(profile);
                    us.setEstado(sit);
                    return us;
                }
            }
        } catch (FileNotFoundException ex) {}
    return us;
    }
    
    public void Modificar(int Id, String nomb, String nomb2, String dir, String tel, String us, String pass, String per, String est){
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
                datos[cont][7] = read.readUTF();
                datos[cont][8] = read.readUTF();
                cont++;
            }
        } catch (IOException ex) {}
        while(x < cont){
            if (Integer.parseInt(datos[x][0].toString()) == Id){
                datos[x][1] = nomb;
                datos[x][2] = nomb2;
                datos[x][3] = dir;
                datos[x][4] = tel;
                datos[x][5] = us;
                datos[x][6] = pass;
                datos[x][7] = per;
                datos[x][8] = est;
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
                write.writeUTF(datos [x][7].toString());
                write.writeUTF(datos [x][8].toString());
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
                datos[cont][1] = read.readUTF();
                datos[cont][2] = read.readUTF();
                datos[cont][3] = read.readUTF();
                datos[cont][4] = read.readUTF();
                datos[cont][5] = read.readUTF();
                datos[cont][6] = read.readUTF();
                datos[cont][7] = read.readUTF();
                datos[cont][8] = read.readUTF();
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
                datos[x][6] = datos[x][6];
                datos[x][7] = datos[x][7];
                datos[x][8] = "** ¡INACTIVO! **";
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
                write.writeUTF(datos [x][7].toString());
                write.writeUTF(datos [x][8].toString());
                x++;
            }
        } catch (IOException ex) {}
    }
}
