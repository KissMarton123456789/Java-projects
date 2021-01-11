/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Gyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tGYAKORLÁS\n");
        Scanner input = new Scanner (System.in);
        
        int elemSzam;
        elemSzam=(int)(Math.random()*10)+10;  //10 és 20 között
        int[] tomb = new int  [elemSzam];
        
        System.out.println("Első tömb elemei:");
        for (int i = 0; i < 10; i++) {
            tomb[i]=(int)(Math.random()*200)-100;   //-100 és + 100 között
            System.out.print(String.format("%, 5d", tomb[i]));
        }
        System.out.println("\n\n");
        
        
        
        
        System.out.print("Adj meg egy számot 20 és 10 között ");
        int elemSzam2 = input.nextInt();
        
        
        while (!(elemSzam2<=20 && elemSzam2>=10)) {
            System.out.print("rossz választ adtál meg, a szám -20 és 20 közé essen");
            elemSzam2 = input.nextInt();
        }
        System.out.println("\nMásodik tömb elemei:");
        int tombDarab = 0;
        int[] tomb2 = new int [elemSzam2];
        
        int tombOsszeg = 0;
        
        for (int i = 0; i < elemSzam2; i++) {
            tomb2[i]=(int) (Math.random() *200)-100; 
            
           tombOsszeg = tombOsszeg + tomb2[i];
            
            System.out.println(String.format("%,5d",tomb2[i]));
            
            if (tomb2[i]<=100 && tomb2[i]>=-100) {
                 tombDarab++;
            }
            System.out.println("");
            
            
        }
        
              
              
              System.out.println("A 2. tömb összege: " + tombOsszeg);
              
              System.out.println("ennyi darab van a tömbben: "+tombDarab);

    }
}
