
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
        
            
       
            Item it = new Item("ps1", 3, 4000);
            Item ite = new Item("ps2", 31, 4920);
            Item item = new Item("ps3",  36, 4800);
            Item item1 = new Item("ps4", 35, 4700);
            Item item2 = new Item("psp", 16, 2000);
            
            
            ItemsDoubleLinkedList l1 = new ItemsDoubleLinkedList();
            l1.addLast(it);
            l1.addLast(ite);
            l1.addLast(item);
            l1.addLast(item1);
            l1.addLast(item2);
            //BubbleSort<Item> bubbleSort = BubbleSort<Item>;
            
            //l1.saveItem();
            int s = ItemsDoubleLinkedList.Search("binaria", "psp", l1);
            System.out.println(s);
    }

}