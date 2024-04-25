package com.mycompany.hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ivan_ Aquí haré uso de la serialización. Puesto que "Habitaciones" no
 * tiene una gran cantidad de campos.
 */
public class Habitaciones_File {

    ObjectOutputStream out = null;
    ObjectInputStream intput = null;
    String url = "Habitaciones.dat";
    File f = new File(url);

    public Habitaciones_File() {
    }

    public void Add_H(ArrayList<Habitaciones> ha) throws IOException {
            out = new ObjectOutputStream(new FileOutputStream(url));
            out.writeObject(ha);
            if (out != null) {
                out.close();
            }
    }

    public ArrayList<Habitaciones> Search() throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(url));
        while (true) {
            ArrayList<Habitaciones> ob = (ArrayList<Habitaciones>) input.readObject();
            return ob;
        }
    }
}
