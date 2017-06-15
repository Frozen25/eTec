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
    public static DoubleLinkedList<Integer> datos = new DoubleLinkedList<Integer> ();
    public static int [][] matriz;
    public static int[][] floyd2;
    
    
    public static DoubleLinkedList getLista(){
        return datos;
    }
    public static void addLista(int N){
        datos.addLast(N);
    }
    
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
    
    public static void modificar(int i, int j , int peso){
        matriz[i][j] = peso;
    }
    
    
    public static void delete(int node){
        
        imprimir(matriz);
        //keep copy of original matrix
        int[][] matrixCopy = matriz;

        //Assume 
        int rowToRemove = node;
        int colToRemove = node;
        int rows = matriz.length;
        int cols = matriz.length;
        // re-initialise matrix with dimension i-1 , j-1
        matriz = new int[rows-1][cols-1];
 

        //row and column counter for the new matrix
        int tmpX=-1;
        int tmpY=-1;


        //re-populate new matrix by searching through the original copy of matrix, while skipping useless row and column
        // works only for 1 row and 1 column in a 2d array but by changing the conditional statement we can make it work for n number of rows or columns in a 2d array.
        for(int i=0; i<rows; i++){
         tmpX++;
         if(i==rowToRemove){
             tmpX--;
         }
         tmpY=-1;
            for(int j=0; j<cols; j++){


               tmpY++;
              if(j==colToRemove){
              tmpY--;
              }

                 if(i!=colToRemove&&j!=colToRemove){

                   matriz[tmpX][tmpY] = matrixCopy[i][j];

                   //System.out.println(counter+" :"+matriz[tmpX][tmpY]);
                 }


            }

        }
        imprimir(matriz);
    
    
    }
    
    
    
    
    
    
    public static void imprimir(int [][] matriz){
        for(int[] i : matriz){
                for(int b : i){
                    System.out.print(b + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("");
        }
    
    
}
