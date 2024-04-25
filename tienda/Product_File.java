package com.mycompany.tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Product_File {
    RandomAccessFile raf = null;
    File file;
    private int n_reg;
    public int tam_per_re = 350;
    
     public Product_File(){
        try {
            // Asignación de las instancias.
            file = new File("Productos.obj");
            raf = new RandomAccessFile(file, "rw");
            try {
                n_reg = (int) Math.ceil((double) raf.length() / (double) tam_per_re);
            } catch (IOException ex) {}
        } catch (FileNotFoundException ex) {}
    }
     
     // Función para recuperar el ID consecutivo en el archivo "Usuario".
    public int get_IdCPr() throws FileNotFoundException, IOException{
        int x = 0;
        for(int i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            x++;
        }
        return x + 1;
    }
    
    public void Add_Pr (Producto pr) throws IOException{
        if(Add_Product(n_reg, pr)){
            n_reg++;
        }
    }
    
    // Escribir un registro en el archivo "Usuario".
    public boolean Add_Product(int i, Producto pr) throws IOException {
        if (i >= 0 && i <= getN_reg()){
            if(pr.getTam() > tam_per_re) {
                return false;
            } else{
                raf.seek(i*tam_per_re);
                raf.writeInt(pr.getID_Pr());
                raf.writeUTF(pr.getName_Pr());
                raf.writeUTF(pr.getCat());
                raf.writeUTF(pr.getDescr());
                raf.writeInt(pr.getPrice());
                raf.writeInt(pr.getStock());
                raf.writeUTF(pr.getVendor());
                raf.writeUTF(pr.getStatus());
                raf.writeUTF(pr.getFoto());
                raf.close();
                return true;
            }
        } else{
            return false;
        }
    }
        
    //Lee y busca un registro en específico dentro del archivo.
    public int Search_Pr(int ID) throws IOException{
        Producto pr = new Producto();
        int i;
        for(i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            pr = getPr(i);
            if(pr.getID_Pr() == ID){
                return i;
            }
        }
        return -1;
    }
    
    public int Search_Pr2(int ID, String Ven) throws IOException{
        Producto pr = new Producto();
        int i;
        for(i = 0; i < getN_reg(); i++){
            raf.seek(i * tam_per_re);
            pr = getPr(i);
            if(pr.getID_Pr() == ID && pr.getVendor().equals(Ven)){
                return i;
            }
        }
        return -1;
    }
      
    public Producto getPr(int i) throws IOException{
        if(i >= 0 && i <= getN_reg()) {    
            raf.seek(i * tam_per_re);
            Producto pr = new Producto();
            pr.setID_Pr(raf.readInt());
            pr.setName_Pr(raf.readUTF());
            pr.setCat(raf.readUTF());
            pr.setDescr(raf.readUTF());
            pr.setPrice(raf.readInt());
            pr.setStock(raf.readInt());
            pr.setVendor(raf.readUTF());
            pr.setStatus(raf.readUTF());
            pr.setFoto(raf.readUTF());
            return pr;
        } else{
            return null;
        }
    }
  
    public boolean Edit_Pr(Producto pr) throws IOException{
        int pos = Search_Pr(pr.getID_Pr());
        Producto npr = new Producto();
        npr = getPr(pos);
        String foto = npr.getFoto();
        if (npr.getStatus().equals("Agotado(a)")){
            return false;
        }
        npr = pr;
        pr.setFoto(foto);
        Add_Product(pos, pr);
        return true;
    }
    
    public boolean Delete_Pr(int ID) throws IOException{
        int pos = Search_Pr(ID);
        Producto pr = new Producto();
        pr = getPr(pos);
        if (pr.getStatus().equals("Agotado(a)")){
            return false;
        }
        pr.setStatus("Agotado(a)");
        Add_Product(pos, pr);
        return true;
    }
    
      public boolean Dec_Pr(int ID, int cant) throws IOException{
        int pos = Search_Pr(ID);
        int tot = 0;
        Producto pr = new Producto();
        pr = getPr(pos);
        if (pr.getStatus().equals("Agotado(a)")){
            return false;
        }else if (cant > pr.getStock()){
            return false;
        }
        tot = pr.getStock();
        pr.setStock(tot - cant);
        Add_Product(pos, pr);
        return true;
    }
    
    public int getN_reg() {
        return n_reg;
    }
}
