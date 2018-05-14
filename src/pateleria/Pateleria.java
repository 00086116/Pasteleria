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
public class Pateleria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pastel pastel = Pasteles. getPastel(Tipo.peque);
        pastel.crear();
        
        Pastel pastel = Pasteles. getPastel(Tipo.mediano);
        pastel.crear();
        
        Pastel pastel = Pasteles. getPastel(Tipo.grande);
        pastel.crear();
    }
    
}
