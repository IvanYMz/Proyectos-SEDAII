
package com.mycompany.tienda;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author ivan_
 */
public class PDF {
    
    Carrito_File cf = new Carrito_File();

    public void G_PDF(ArrayList<Carrito> lst){
        try {
            
            
            
            PDDocument doc = new PDDocument();
            PDPage pag = new PDPage(PDRectangle.A0);
            doc.addPage(pag);
            PDPageContentStream cont = new PDPageContentStream(doc, pag);
            cont.beginText();
            cont.setFont(PDType1Font.TIMES_ROMAN, 12);
            cont.newLineAtOffset(12, pag.getMediaBox().getHeight() - (42));
            cont.showText(lst.get(0).getFecha());
            cont.endText();
            
            int total = 0;
            
            cont.beginText();
            cont.setFont(PDType1Font.TIMES_ROMAN, 12);
            cont.newLineAtOffset(12, pag.getMediaBox().getHeight() - (56));
            cont.showText("- Detalles de la compra");
            cont.endText();
            
            for(int i = 0; i < lst.size(); i++){
                cont.beginText();
                cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                cont.newLineAtOffset(12, pag.getMediaBox().getHeight() - (52*(i+2)));
                cont.showText("Producto: " + lst.get(i).getProducto() + ",");
                cont.showText(String.valueOf("        costo por unidad: " + lst.get(i).getCosto_u()) + ",");
                cont.showText(String.valueOf("        cantidad de unidades: " + lst.get(i).getCantidad()) + ",");
                cont.showText("        vendedor: " + lst.get(i).getVendedor());
                total = total + lst.get(i).getCosto();
                cont.endText();
            }
            
            cont.beginText();
            cont.setFont(PDType1Font.TIMES_ROMAN, 12);
            cont.newLineAtOffset(12, pag.getMediaBox().getHeight() - (52 * lst.size() * 2));
            cont.showText("Costo total: " + total);
            cont.endText();

            cont.close();
            String ext = ".pdf";
            String g = String.valueOf(cf.get_IdCPr());
            String urlsave = "C:\\Users\\ivan_\\OneDrive\\Documents\\NetBeansProjects\\Compra" + g + ext; 
            
            doc.save(urlsave);

        } catch (IOException ex) {}
        
    }
    
}
