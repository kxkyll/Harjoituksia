/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package harjoitus1;

import java.util.Scanner;

/**
 *
 * @author Kati
 */
//Kati Kyllönen Viikko # Tehtävä #.#
public class Harjoitus1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Aloita pienestä");
        System.out.print("Anna aihe: ");
        String aihe = lukija.nextLine();
        System.out.println("Aiheesi: "+aihe);
    }

}
