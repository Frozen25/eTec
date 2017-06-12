/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import basicsOBJs.Item;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Gabriel
 */
public class ItemsDoubleLinkedList extends DoubleLinkedList<Item> {
    public void savePaq()
    {
        Node n1 =this.getHead();
        savePaq(n1, "Items");
    }
     private void savePaq(Node<Item> n1,String FileName)
    {
         try {

            DocumentBuilderFactory dfc = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dfc.newDocumentBuilder();

            Document doc = db.newDocument();
            Element Mainelement = doc.createElement("Items");
            doc.appendChild(Mainelement);
                
            int munId = 1;
            while (n1 != null) {
                Element element = doc.createElement("Item");
                Mainelement.appendChild(element);
                
                
                Attr attr = doc.createAttribute("id");
                attr.setValue(String.valueOf(munId));
                element.setAttributeNode(attr);
                munId++;    
                
                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(n1.getData().getNombre()));
                element.appendChild(nombre);

                Element imagen = doc.createElement("imagen");
                imagen.appendChild(doc.createTextNode(n1.getData().getImagen()));
                element.appendChild(imagen);

                Element precio = doc.createElement("precio");
                precio.appendChild(doc.createTextNode(String.valueOf(n1.getData().getPrecio())));
                element.appendChild(precio);

                Element stock = doc.createElement("stock");
                stock.appendChild(doc.createTextNode(String.valueOf(n1.getData().getStock())));
                element.appendChild(stock);

                n1 = n1.getNext();
            }

            TransformerFactory tfac = TransformerFactory.newInstance();
            Transformer tra = tfac.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult str = new StreamResult(new File("C:\\Users\\Gabriel\\Documents\\serverdata\\"+FileName+".xml"));

            tra.transform(source, str);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ItemsDoubleLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(ItemsDoubleLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ItemsDoubleLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
