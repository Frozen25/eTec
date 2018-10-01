package Algoritmos.Search;

import Estructuras.*;
import Services.Productos;

public class Binary_Search_Items  {
	     
        public static int busquedaBinaria_Items(ItemsDoubleLinkedList list, int dato){
		int n = list.getSize(); 
		int centro,inf=0,sup=n-1; 
		
		while(inf<=sup){ 
			centro=(sup+inf)/2; 
			if(list.getAt(centro).getData().getCode()==dato){ 
                            System.out.println(centro);
                            return centro;
                        } 
                        
                        else 
                            if(dato < (list.getAt(centro).getData().getCode()) ){ 
                                sup=centro-1;  
                            }
                            else { 
                                inf=centro+1; 
                            } 
                } 
                return -1; 
        } 

}
