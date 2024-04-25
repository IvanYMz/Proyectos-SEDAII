package com.mycompany.tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ivan_
 */
public class Carrito_File {
    RandomAccessFile raf = null;
    File file;
    private int n_reg;
    private int tam_per_re = 350;
    
    public Carrito_File(){
        try {
            // Asignación de las instancias.
            file = new File("Carrito.obj");
            raf = new RandomAccessFile(file, "rw");
            try {
                n_reg = (int) Math.ceil((double) raf.length() / (double) tam_per_re);
            } catch (IOException ex) {}
        } catch (FileNotFoundException ex) {}
    }
    
    public int get_IdCPr() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x + 1;
    }
    
    public void Add_C (Carrito c) throws IOException{
        if(Add_Compra(n_reg, c)){
            n_reg++;
        }
    }
    
    // Escribir un registro en el archivo "Usuario".
    public boolean Add_Compra(int i, Carrito c) throws IOException {
        if (i >= 0 && i <= getN_reg()){
            if(c.getTam() > tam_per_re) {
                return false;
            } else{
                raf.seek(i*tam_per_re);
                raf.writeInt(c.getId());
                raf.writeUTF(c.getProducto());
                raf.writeUTF(c.getDescripción());
                raf.writeInt(c.getCosto_u());
                raf.writeInt(c.getCosto());
                raf.writeInt(c.getCantidad());
                raf.writeUTF(c.getFecha());
                raf.writeUTF(c.getVendedor());
                return true;
            }
        } else{
            return false;
        }
    }
    
    public int getN_reg() {
        return n_reg;
    }
}
