
import Algoritmos.Sorts.BubbleSort;
import Estructuras.DoubleLinkedList;
import Estructuras.ItemsDoubleLinkedList;
import Estructuras.Node;
import basicsOBJs.Item;
import java.io.File;
import java.io.IOException;
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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class purebaitem {

    public static void main(String[] args) {
        
            
       
        try {
            Item it = new Item("ps1", "ps1.jpg", 3.5, 4000);
            Item ite = new Item("ps2", "ps2.jpg", 31.5, 4920);
            Item item = new Item("ps3", "ps3.jpg", 36.5, 4800);
            Item item1 = new Item("ps4", "ps4.jpg", 35.5, 4700);
            Item item2 = new Item("psp", "psp.jpg", 16.5, 2000);
            
            
            ItemsDoubleLinkedList l1 = new ItemsDoubleLinkedList();
            l1.addLast(it);
            l1.addLast(ite);
            l1.addLast(item);
            l1.addLast(item1);
            l1.addLast(item2);
            //BubbleSort<Item> bubbleSort = BubbleSort<Item>;
            
            l1.saveItem();
            File xmlFile= new File("C:\\Users\\Gabriel\\Documents\\serverdata\\items.xml");
            DocumentBuilderFactory dfc = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dfc.newDocumentBuilder();
            Document doc = db.parse(xmlFile);
            
            doc.getDocumentElement().normalize();
            
            NodeList list = doc.getElementsByTagName("Item");
            
            ItemsDoubleLinkedList lispro =new ItemsDoubleLinkedList();
            
             for (int temp = 0; temp < list.getLength();temp++){
                 org.w3c.dom.Node noNode = list.item(temp);
                 
                 if(noNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE){
                 Element eElement = (Element) noNode;
                    String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
                    String imagen = eElement.getElementsByTagName("imagen").item(0).getTextContent();
                    String precio = eElement.getElementsByTagName("precio").item(0).getTextContent();
                    String stock = eElement.getElementsByTagName("stock").item(0).getTextContent();
                    double value;
                    int cantidad;
                    System.out.println(stock);
                     if (precio.equals("0.0") || precio.equals("") || precio.equals("0")){
                        value = 0;
                    }
                    else{
                        value = Double.parseDouble(precio);
                    }
                     if (stock.equals("") || stock.equals("0")){
                        cantidad = 0;
                    }
                    else{
                        cantidad = Integer.parseInt(stock);
                    }
                    Item iTemp =new Item(nombre,imagen,value,cantidad);
                    lispro.addLast(iTemp);
                 }
             }
             
            
            
            
            
            
            
            
            
            
            System.out.println(lispro.getHead().getData().getNombre());
            
            
            
            
            
            
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(purebaitem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(purebaitem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(purebaitem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }

//https://www.youtube.com/watch?v=zFufOEsvHqU