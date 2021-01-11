/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszegzes;

/**
 *
 * @author user
 */
public class Osszegzes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      //dekraláljuk, és inicializáljuk a változókat
        int[] tomb = new int[10];
        int[] tomb1 = new int[10];
        
        int osszeg = 0;
        int osszeg1 = 0;
        
        
        //létrehozunk egy tömböt, ami 10 random számot generál és kiírja őket  és a számok összegét kiszámítjuk
        System.out.println("Az 1. tömb elemei: ");
        for(int i = 0; i < tomb.length; i++)
        {
            tomb[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb[i]; // osszeg += tomb[i]
            System.out.print(tomb[i] + " ");
        }
        
        
        //létrehozunk egy másik tömböt (ami 10 random számot generál és kiírja őket és a számok összegét kiszámítjuk )
        System.out.println("\n\nA 2. tömb elemei: ");
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1;
            osszeg1 = osszeg1 + tomb1[i]; // osszeg += tomb[i]
            System.out.print(tomb1[i] + " ");
        }
        
       //kiírjuk az összeget, kiszámítjuk a 2 tömb külön különi átlagát és ki is írjuk
       
        double atlag = osszeg / (double) tomb.length;
        double atlag1 = osszeg1 / (double) tomb1.length;
        System.out.println("\n\nAz 1. tömbben lévő szamok összege: " + osszeg);
        System.out.println("Az 1. tömbben lévő szamok átlaga (egy tizedesjegyig): " + atlag);
        
        System.out.println("\nA 2. tömbben lévő szamok összege: " + osszeg1);
        System.out.println("A 2. tömbben lévő szamok átlaga (egy tizedesjegyig): " + atlag1);
    }
    
}
