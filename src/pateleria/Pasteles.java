/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pateleria;

/**
 *
 * @author UCA
 */
public class Pasteles {
   public static Pateleria getPateleria(Tipo criteria){
       switch (criteria){
           case peque:
               return new Caramelo();
           case mediano: 
               return new Chocolate();
           case grande:
               return new Fruta();
         
       }
       return null;
   }
    
}
