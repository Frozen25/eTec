/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Estructuras;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Alexis
 */

public class Test_Arboles {
    
    public static void main (String[] args)
    
    {
        //arbol binario
    //abrir x=1  guardar x=2
        //arbol splay
    //abrir x=5 guardar x=6
        //arbol avl
    //abrir x=7 guardar x=8
    int x = 0;
    double u = 0;
        System.out.println();

//Clientes    
    ClientesBST clientes = ClientesBST.loadClientBST();
    clientes.displayPre();
    clientes.getClient("Bryan").addMoney(132.455);
    clientes.getClient("Bryan").changeEmail("correnuevo@nv");
    clientes.getClient("Bryan").setActive(true);
    clientes.save();
//Admins
    AdminBST ad = AdminBST.load_Adm();
    ad.getMember("pedro").setCodigo(4);
    ad.save_Adm();
    
    if (x==8)
    {
        ArbolAVL nuevo=new ArbolAVL();
        AVLcita cit1 =new AVLcita(1, "Juan");
        AVLcita cit2 =new AVLcita(2, "Pedro");
        AVLcita cit3 =new AVLcita(3, "lucas");
        AVLcita cit4 =new AVLcita(4, "ema");
        AVLcita cit5 =new AVLcita(5, "lola");
        AVLcita cit6 =new AVLcita(6, "paco");
        nuevo.Insercion(cit1);
        nuevo.Insercion(cit2);
        nuevo.Insercion(cit3);
        nuevo.Insercion(cit4);
        nuevo.Insercion(cit5);
        nuevo.Insercion(cit6);

        nuevo.find(cit1);
        System.out.println(nuevo.get(4).paciente);
        nuevo.get(4).cambiarPaciente("nuevopaciente");
        System.out.println("change "+nuevo.get(4).paciente);
        nuevo.InordenAVL();

        nuevo.save();
    }
    
    
    
    
    if (x==7)
    {
    try {

            File fXmlFile = new File(System.getProperty("user.dir") +"\\Citas.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Cita");

            //System.out.println("----------------------------");
            
            ArbolAVL nuevoAVL =new ArbolAVL();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                org.w3c.dom.Node nNode = nList.item(temp);

                //System.out.println("\nCurrent Element :" + nNode.getNodeName());


                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    
                    String nombre = eElement.getElementsByTagName("Nombre").item(0).getTextContent();
                    String Numero = eElement.getElementsByTagName("Numero").item(0).getTextContent();
                    String monto = eElement.getElementsByTagName("MontoPagar").item(0).getTextContent();

                    AVLcita tempCita =new AVLcita( Integer.parseInt(Numero), nombre, Float.valueOf(monto));
                    
                    nuevoAVL.Insercion(tempCita);



                    }
            }
            
            //print tree
            nuevoAVL.InordenAVL();
            
            //newBST.save("name");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    
    }
    
    if (x==6)
        {
            Splay nuevo=new Splay();
            Doctor d1 = new Doctor("a123", "Luis");
            Doctor d2 = new Doctor("b123", "Juan");
            Doctor d3 = new Doctor("z123", "Pito");
            Doctor d4 = new Doctor("c123", "lolo");
            Doctor d5 = new Doctor("a965", "paco");



            nuevo.Insertar(d1);	
            System.out.println(nuevo.raiz.datos.codigo);
            nuevo.Insertar(d2);	
            System.out.println(nuevo.raiz.datos.codigo);
            nuevo.Insertar(d3);	
            System.out.println(nuevo.raiz.datos.codigo);
            nuevo.Insertar(d4);	
            System.out.println(nuevo.raiz.datos.codigo);
            nuevo.Insertar(d5);	
            System.out.println(nuevo.raiz.datos.codigo);
            System.out.println(nuevo.Buscar("z123").datos.nombre);
            nuevo.Buscar("z123").datos.setNombre("nuevonombre");
            System.out.println("change "+nuevo.Buscar("z123").datos.nombre);
            nuevo.Postorden(nuevo.raiz);
            System.out.println("seach a\n" + nuevo.look(""));


            nuevo.save();

	}
    
    if (x==5)
    {
    try {

            File fXmlFile = new File(System.getProperty("user.dir") +"\\Doctores.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Doctor");

            //System.out.println("----------------------------");
            
            Splay nuevoSplay=new Splay();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                org.w3c.dom.Node nNode = nList.item(temp);

                //System.out.println("\nCurrent Element :" + nNode.getNodeName());


                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    
                    String nombre = eElement.getElementsByTagName("Nombre").item(0).getTextContent();
                    
                    String codigo = eElement.getElementsByTagName("Codigo").item(0).getTextContent();

                    Doctor tempDoc = new Doctor(codigo, nombre);
                    nuevoSplay.Insertar(tempDoc);



                    }
            }
            
            //print tree
            System.out.println(nuevoSplay.look(""));
            
            //newBST.save("name");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    
    }
    
    //Guardar este arbol
    if (x==2){
        
        
        BinarySearchTree b = new BinarySearchTree();
        CasoClinico coco = new CasoClinico("coco");

        coco.addExamenes("colesterol", "200");

        coco.addMedicamentos("asetaminofen", "150");
        b.insert(coco);
        
        CasoClinico pez = new CasoClinico("pez");
        
        pez.addMedicamentos("asetaminofen", "150");
        pez.addMedicamentos("bruprofenol", "140");
        b.insert(pez);
        
        CasoClinico area = new CasoClinico("area");
        area.addExamenes("estatura", "50");
        area.addExamenes("anchura", "50");
        b.insert(area);
        CasoClinico aereo = new CasoClinico("aereo");
        b.insert(aereo);
        CasoClinico arena = new CasoClinico("arena");
        b.insert(arena);
        CasoClinico pato = new CasoClinico("pato");
        pato.addExamenes("peso", "100");
        System.out.println(pato.getInfo());
        b.insert(pato);
        b.getCaso("pato").removeExamen("peso");
        //b.display();		
        System.out.println("\n look ");
        System.out.println(b.look(""));
        b.getCaso("arena").removeMedicamento("asetaminofen");
        System.out.println("\n search a");
        System.out.println(b.search("a"));
        
        
        b.save();
        
    }
//Abrir el arbol
    if (x==1){
        
        try {

            File fXmlFile = new File(System.getProperty("user.dir") +"\\Casos_Clinicos.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Caso");

            //System.out.println("----------------------------");
            
            BinarySearchTree newBST = new BinarySearchTree();
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                org.w3c.dom.Node nNode = nList.item(temp);

                //System.out.println("\nCurrent Element :" + nNode.getNodeName());


                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    CasoClinico CasoTemp = new CasoClinico(eElement.getAttribute("id"));

                    String examenes = eElement.getElementsByTagName("Examenes").item(0).getTextContent();

                    if ((!(examenes.equals("")))&&(!(examenes.equals(" "))))
                    {
                        String[] parts = examenes.split(";");
                        for(int i=0;i<parts.length;i++)
                        {
                            String[] dat = parts[i].split("_");
                            CasoTemp.addExamenes(dat[0], dat[1]);
                        }
                    }
 
                    String medics = eElement.getElementsByTagName("Medicamentos").item(0).getTextContent();
                    
                    if ((!medics.equals(""))&&(!(medics.equals(" "))))
                    {
                        String[] parts = medics.split(";");
                        for(int i=0;i<parts.length;i++)
                        {
                            String[] dat = parts[i].split("_");
                            CasoTemp.addMedicamentos(dat[0], dat[1]);
                        }
                    }

                    newBST.insert(CasoTemp);



                    //System.out.println("Staff id : " + eElement.getAttribute("id"));
                    //System.out.println("Nombre : " + eElement.getElementsByTagName("Nombre").item(0).getTextContent());
                    //System.out.println("Examenes : " + eElement.getElementsByTagName("Examenes").item(0).getTextContent());
                    //System.out.println("Medicamentos : " + eElement.getElementsByTagName("Medicamentos").item(0).getTextContent());


                    }
            }
            
            //print tree
            newBST.displayPre();
            //newBST.save("name");
            System.out.println("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }
    
        
        
        
    }

}