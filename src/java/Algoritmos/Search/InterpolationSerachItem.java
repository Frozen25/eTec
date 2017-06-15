/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos.Search;

import Estructuras.ItemsDoubleLinkedList;

/**
 *
 * @author Gabriel
 */
public class InterpolationSerachItem {
    public static  int interpolationSearchDoubleLinkedList(ItemsDoubleLinkedList sortedArray, int toFind)
    {
        int low = 0;
        int high = sortedArray.getSize() - 1;
        int mid;
        while ((sortedArray.getAt(low).getData().getCode() <= toFind) && ((sortedArray.getAt(high).getData().getCode()) >= toFind)) 
        {
            if (sortedArray.getAt(high).getData().equals(sortedArray.getAt(low).getData()) ){
                System.out.println((low +high)/2);
                return (low + high)/2;}
            /** out of range is possible  here **/
             mid = low + ((toFind - sortedArray.getAt(low).getData().getCode()) * (high - low)) / (sortedArray.getAt(high).getData().getCode() - sortedArray.getAt(low).getData().getCode());  
 
             if (sortedArray.getAt(mid).getData().getCode() < toFind)
                 low = mid + 1;
             else if (sortedArray.getAt(mid).getData().getCode() > toFind)
                 high = mid - 1;
             else
                 return mid;
        }
        if (sortedArray.getAt(low).getData().getCode() == toFind)
            return low;
           /** not found **/
        else
            return -1; 
    }    
}
