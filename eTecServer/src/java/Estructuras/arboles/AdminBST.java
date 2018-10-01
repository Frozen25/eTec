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



public class AdminBST {
    public   AdminNodo root;
    private  String lookstack;
    private int contador = 0;
    public final static  String direccion = "D:\\0-Tec\\Datos 1\\proyecto 3\\XML";
    public AdminBST(){
            this.root = null;
    }

    public boolean isMember(String id){
        AdminNodo current = root;
        while(current!=null){
            if(current.getData().getName().equals(id)){
                    return true;
            }else if(current.getData().getName().compareTo(id)>0){
                    current = current.left;
            }else{
                    current = current.right;
            }
        }
        return false;
    }
    public Admin_Dist getMember(String id){
        AdminNodo current = root;
        while(current!=null){
            if(current.getData().getName().equals(id)){
                    return current.getData();
            }else if(current.getData().getName().compareTo(id)>0){
                    current = current.left;
            }else{
                    current = current.right;
            }
        }
        return null;
    }
    
 
    public boolean delete(String id){
        AdminNodo parent = root;
        AdminNodo current = root;
        boolean isLeftChild = false;
        while(!(current.getData().getName().equals(id))){
            parent = current;
            if(current.getData().getName().compareTo(id)>0){
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
            AdminNodo successor = getSuccessor(current);
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

    public AdminNodo getSuccessor(AdminNodo deleleNode){
        AdminNodo successsor =null;
        AdminNodo successsorParent =null;
        AdminNodo current = deleleNode.right;
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
    public void insert(Admin_Dist id){
        AdminNodo newNode = new AdminNodo(id);
        if(root==null){
            root = newNode;
            return;
        }
        AdminNodo current = root;
        AdminNodo parent = null;
        while(true){
            parent = current;
            if(current.getData().getName().compareTo(id.getName())>0){				
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
    
    private void display(AdminNodo root){
        if(root!=null){
            display(root.left);
            System.out.print(" " + root.getData().getName());
            display(root.right);
        }
    }
    
    public String displayIn(){
        lookstack = "";
        displayIn(root);
        return lookstack;
    }
    
    private void displayIn(AdminNodo root){
        if(root!=null){
            displayIn(root.left);
            lookstack += root.getData().getName() +"_"+ root.getData().getInfo();
            //System.out.print(" " + root.getData().getName());
            displayIn(root.right);
        }
    }
    
    public void displayPre(){
        displayPre(root);      
    }
    
    private void displayPre(AdminNodo root){
        if(root!=null){
            System.out.print(" " + root.getData().getName());
            displayPre(root.left);
            displayPre(root.right);
        }
    }
    

    
    public void save_Adm()
    {
        save_Adm(root, "Admin_Dist");
    }
    public void save_Adm(String name)
    {
        name = name.replaceAll(" ", "");
        save_Adm(root, name);
    }
 
    // An iterative process to print preorder traversal of Binary tree
    private void save_Adm(AdminNodo node, String fileName) {
        try{
            // Base Case
            if (node == null) {
                return;
            }
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Admin_Dist");
            doc.appendChild(rootElement);
            // Create an empty stack and push root to it
            Stack<AdminNodo> nodeStack = new Stack<AdminNodo>();
            nodeStack.push(root);
            /* Pop all items one by one. Do following for every popped item
             a) print it
             b) push its right child
             c) push its left child
             Note that right child is pushed first so that left is processed first */
            while (nodeStack.empty() == false) {
                // Pop the top item from stack and print it
                AdminNodo mynode = nodeStack.peek();
                
                
                Element element = doc.createElement("Adm_Dis");
                rootElement.appendChild(element);
                // set attribute to staff element
		Attr attr = doc.createAttribute("id");
		attr.setValue(mynode.getData().getName());
		element.setAttributeNode(attr);
                
                Element at1 = doc.createElement("Nombre");
		at1.appendChild(doc.createTextNode(mynode.getData().getName()));
		element.appendChild(at1);
                
                Element at2 = doc.createElement("Codigo");
                String code = Integer.toString(mynode.getData().getCodigo());
		at2.appendChild(doc.createTextNode(code));
		element.appendChild(at2);
                
                Element at3 = doc.createElement("Password");
		at3.appendChild(doc.createTextNode(mynode.getData().getPass()));
		element.appendChild(at3);

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
            StreamResult result = new StreamResult(new File(direccion + "\\"+fileName+".xml"));
            // Output to console for testing
            //StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);
      } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
      } catch (TransformerException tfe) {
            tfe.printStackTrace();
      }
    }
    
    public static AdminBST load_Adm(){
        try {    
            File fXmlFile = new File(direccion + "\\Admin_Dist.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Adm_Dis");

            //System.out.println("----------------------------");
            
            AdminBST newBST = new AdminBST();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                org.w3c.dom.Node nNode = nList.item(temp);

                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    String nombre = eElement.getAttribute("id");
                    String codigo  = eElement.getElementsByTagName("Codigo").item(0).getTextContent();
                    int code = Integer.valueOf(codigo);
                    String pass  = eElement.getElementsByTagName("Password").item(0).getTextContent();
                    
                    Admin_Dist adm = new Admin_Dist( nombre, code, pass);
                    newBST.insert(adm);
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

