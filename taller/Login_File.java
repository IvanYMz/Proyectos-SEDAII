package MP;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Login_File {
    private String url = "Users.txt";
    private DataInputStream read2;
    
    public Login_File(){
        read2 = null;
    }
    
    public Boolean Autenticar(String user_name, String password) throws FileNotFoundException{
        Boolean ban = false;
        read2 = new DataInputStream(new FileInputStream(url));
        int id = 0;
        String name = "", secname = "", addres = "", phone = "", user = "", pass = "", profile = "", sit = "";
         try {
             while(true && ban == false){
                id = read2.readInt();
                name = read2.readUTF();
                secname = read2.readUTF();
                phone = read2.readUTF();
                addres = read2.readUTF();
                user = read2.readUTF();
                pass = read2.readUTF();
                profile = read2.readUTF();
                sit = read2.readUTF();
                if(user.equals(user_name) && pass.equals(password)){
                    ban = true;
                }
             }
        } catch (IOException ex) {}
        return ban;
    }
    
    public int Profile(String user_name, String password) throws FileNotFoundException{
        int type = 0;
        Boolean ban = false;
        read2 = new DataInputStream(new FileInputStream(url));
        int id = 0;
        String name = "", secname = "", addres = "", phone = "", user = "", pass = "", profile = "", sit = "";
         try {
             while(true && ban == false){
                id = read2.readInt();
                name = read2.readUTF();
                secname = read2.readUTF();
                phone = read2.readUTF();
                addres = read2.readUTF();
                user = read2.readUTF();
                pass = read2.readUTF();
                profile = read2.readUTF();
                sit = read2.readUTF();
                if(user.equals(user_name) && pass.equals(password)){
                    if(profile.equals("Administrador")){
                    ban = true;
                    type = 1;
                    }
                    else if(profile.equals("Mecánico")){
                    ban = true;
                    type = 2;
                    }
                }
             }
        } catch (IOException ex) {}
        return type;
    }
}
