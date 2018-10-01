/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.arboles;

/**
 *
 * @author Alexis
 */

import Estructuras.*;
import basicsOBJs.Item;
import basicsOBJs.Paquete;
import java.io.File;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;



public class PaquetesBST {
    public   PaquetesBSTNodo root;
    private  String lookstack;
    private int contador = 0;
    public final static  String direccion = AdminBST.direccion;
    public PaquetesBST(){
            this.root = null;
    }

    public boolean isMember(int id){
        PaquetesBSTNodo current = root;
        while(current!=null){
            if(current.getData().getCode()==(id)){
                    return true;
            }else if(current.getData().getCode()>(id)){
                    current = current.left;
            }else{
                    current = current.right;
            }
        }
        return false;
    }
    public Paquete getMember(int id){
        PaquetesBSTNodo current = root;
        while(current!=null){
            if(current.getData().getCode()==(id)){
                    return current.getData();
            }else if(current.getData().getCode()>(id)){
                    current = current.left;
            }else{
                    current = current.right;
            }
        }
        return null;
    }
    

    public boolean delete(int id){
        PaquetesBSTNodo parent = root;
        PaquetesBSTNodo current = root;
        boolean isLeftChild = false;
        while(!(current.getData().getCode()==(id))){
            parent = current;
            if(current.getData().getCode()>(id)){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current ==null){
                return false;
            }
        }
        //if i am here that means we have found the node
        //Case 1: if node to be deleted has no children
        if(current.left==null && current.right==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild ==true){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }
        //Case 2 : if node to be deleted has only one child
        else if(current.right==null){
            if(current==root){
                root = current.left;
            }else if(isLeftChild){
                parent.left = current.left;
            }else{
                parent.right = current.left;
            }
        }
        else if(current.left==null){
            if(current==root){
                root = current.right;
            }else if(isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        }else if(current.left!=null && current.right!=null){

            //now we have found the minimum element in the right sub tree
            PaquetesBSTNodo successor = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else{
                parent.right = successor;
            }			
            successor.left = current.left;
        }		
        return true;		
    }

    public PaquetesBSTNodo getSuccessor(PaquetesBSTNodo deleleNode){
        PaquetesBSTNodo successsor =null;
        PaquetesBSTNodo successsorParent =null;
        PaquetesBSTNodo current = deleleNode.right;
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        //check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
            //successsorParent
        if(successsor!=deleleNode.right){
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        System.out.println("deleted!");
        return successsor;
    }
    public void insert(Paquete id){
        PaquetesBSTNodo newNode = new PaquetesBSTNodo(id);
        if(root==null){
            root = newNode;
            return;
        }
        PaquetesBSTNodo current = root;
        PaquetesBSTNodo parent = null;
        while(true){
            parent = current;
            if(current.getData().getCode() > (id.getCode())){				
                current = current.left;
                if(current==null){
                    parent.left = newNode;
                    return;
                }
            }else{
                current = current.right;
                if(current==null){
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    public void display(){
        display(root);      
    }
    
    private void display(PaquetesBSTNodo root){
        if(root!=null){
            display(root.left);
            System.out.print(" " + root.getData().getCode());
            display(root.right);
        }
    }
    

    

    
    


    
    
    
    public void savePaq()
    {
        savePaq(root, "Paquetes");
    }
    public void savePaq(String name)
    {
        name = name.replaceAll(" ", "");
        savePaq(root, name);
    }
 
    // An iterative process to print preorder traversal of Binary tree
    private void savePaq(PaquetesBSTNodo node, String fileName) {
        try{
         
            // Base Case
            if (node == null) {
                return;
            }
            
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Paquetes");
            doc.appendChild(rootElement);
            
            
            // Create an empty stack and push root to it
            Stack<PaquetesBSTNodo> nodeStack = new Stack<PaquetesBSTNodo>();
            nodeStack.push(root);

            /* Pop all items one by one. Do following for every popped item
             a) print it
             b) push its right child
             c) push its left child
             Note that right child is pushed first so that left is processed first */
            while (nodeStack.empty() == false) {

                // Pop the top item from stack and print it
                PaquetesBSTNodo mynode = nodeStack.peek();
                
                //System.out.print(mynode.getName() + " ");
                
                Element element = doc.createElement("Paquete");
                rootElement.appendChild(element);
                
                // set attribute to staff element
		Attr attr = doc.createAttribute("id");
                String id = Integer.toString(mynode.getData().getCode());
		attr.setValue(id);
		element.setAttributeNode(attr);
                
                Element at1 = doc.createElement("Codigo");
                String code = Integer.toString(mynode.getData().getCode());
		at1.appendChild(doc.createTextNode(code));
		element.appendChild(at1);
                
                Element at2 = doc.createElement("Estado");
                String est = Boolean.toString(mynode.getData().getState());
		at2.appendChild(doc.createTextNode(est));
		element.appendChild(at2);
                
                Element at3 = doc.createElement("Lugar");
                String lug = Integer.toString(mynode.getData().getLocation());
		at3.appendChild(doc.createTextNode(lug));
		element.appendChild(at3);
                
                Element at4 = doc.createElement("Destino");
                String des;
                if ((Integer.toString(mynode.getData().getDestino()) != null)){
                    des = Integer.toString(mynode.getData().getDestino());
                }else{
                    des = " ";
                }
		at4.appendChild(doc.createTextNode(des));
		element.appendChild(at4);
                
                Element atn = doc.createElement("Items");
                DoubleLinkedList lista = mynode.getData().getlist();
                Node current;
                String it;  
                try{
                    current = lista.getHead();
                    it = "";
                    while (current!=null){
                        String name = (String)current.getData();
                        it += name+">";
                        current = current.getNext();  
                    }
                }catch (Exception e){
                    it = " ";
                }
                
                    
                
                
                atn.appendChild(doc.createTextNode(it));
                element.appendChild(atn);
                
               
                
                nodeStack.pop();

                // Push right and left children of the popped node to stack
                if (mynode.right != null) {
                    nodeStack.push(mynode.right);
                }
                if (mynode.left != null) {
                    nodeStack.push(mynode.left);
                }
            }

        
           
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(direccion + "\\"+ fileName+".xml"));

            // Output to console for testing
            //StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);


      } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
      } catch (TransformerException tfe) {
            tfe.printStackTrace();
      }
        
    }
    
    public static PaquetesBST loadPaquetes(){
        try {    
            File fXmlFile = new File(direccion + "\\Paquetes.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Paquete");

            //System.out.println("----------------------------");
            
            PaquetesBST newBST = new PaquetesBST();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                org.w3c.dom.Node nNode = nList.item(temp);

                //System.out.println("\nCurrent Element :" + nNode.getNodeName());


                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    String lugar = eElement.getElementsByTagName("Lugar").item(0).getTextContent();
                    String des = eElement.getElementsByTagName("Destino").item(0).getTextContent();
                    int dest;
                    if (des.equals(" ") || (des.equals("") || (des.equals(null)))){
                    dest=-1;
                    }else{
                    dest = Integer.valueOf(des);
                    }
                        
                        
                    
                    
                    Paquete paqtemp = new Paquete(Integer.parseInt(eElement.getAttribute("id")) , Integer.parseInt(lugar), dest);
                    
                    String estad = eElement.getElementsByTagName("Estado").item(0).getTextContent();
                    
                    paqtemp.setEstado(Boolean.valueOf(estad));
                    
                    
 
                    String its = eElement.getElementsByTagName("Items").item(0).getTextContent();
                    
                    
                    if ((!its.equals(""))&&(!(its.equals(" "))))
                    {
                        String[] parts = its.split(">");
                        for(int i=0;i<parts.length;i++)
                            {
                                paqtemp.addPaquete(parts[i]);
                            }
                    }
                    newBST.insert(paqtemp);
                    

                    
                    }
            }
            
            //print tree
            //newBST.displayPre();
            //newBST.save("name");
            
            return newBST;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
        
        
    }
    
        
        
 

}

