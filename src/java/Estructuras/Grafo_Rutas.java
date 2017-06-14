/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Alexis
 */
public class Grafo_Rutas {
    public static int [][] matriz;
    public static int[][] floyd2;
    
    
    public static void addNodo(){
        
        if ((matriz!=null)&&(matriz.length!=0)){
            int len = matriz.length;
            int [][]newMat = new int [len+1][len+1];
            for(int i=0; i<len; i++){
                for(int j=0;j<len;j++){
                    newMat[i][j]= matriz[i][j];
                }
            }
            matriz = newMat;            
        }
        else{
            matriz = new int [1][1];
        }
    }
    
    public static void addNodo(int[]entran, int[]salen){
        
        if ((entran.length==salen.length)&&(salen.length==matriz.length)){
            if ((matriz!=null)&&(matriz.length!=0)){
                int len = matriz.length;
                int [][]newMat = new int [len+1][len+1];
                int i = 0;
                int j = 0;
                for(i=0; i<len; i++){
                    for(j=0;j<len;j++){
                        newMat[i][j]= matriz[i][j];
                    }
                    newMat[i][j]= entran[i];
                }
                for(j=0;j<len+1;j++){
                        newMat[len][j]= salen[j];
                }
                newMat[len+1][len+1] =0;
                matriz = newMat;   
            }
            else{
                matriz = new int [1][1];
                matriz[0][0] = 0;
            }
        }
    }
    
    public void modificar(int i, int j , int peso){
        matriz[i][j] = peso;
    }
    
    
    
    
    
    
    
}
