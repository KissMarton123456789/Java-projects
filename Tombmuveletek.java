/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmuveletek;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        int[] tomb = new int[10];
        int[] tomb1 = new int[10];
        
        int osszeg = 0;
        int osszeg1 = 0;
        
        
        for(int i = 0; i < tomb.length; i++)
        {
            tomb[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb[i]; // osszeg += tomb[i]
            System.out.print(tomb[i] + " ");
        }
        
        int szam;
        
        //létrehozunk egy másik tömböt (ami 10 random számot generál és kiírja őket és a számok összegét kiszámítjuk )
        System.out.println("\n\nA 2. tömb elemei: ");
        
        
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1;
            osszeg1 = osszeg1 + tomb1[i]; // osszeg += tomb[i]
            System.out.print(tomb1[i] + " ");
            System.out.println(String.format("%,3d",tomb1[i])+"+");
        }
        
        System.out.print("\n\nennyi szám van a tömbbe:");
        
        szam = input.nextInt(   );
        
        int o1 = tomb[0] + tomb1[0];
         int o2 = tomb[1] + tomb1[1];
        int o3 = tomb[2] + tomb1[2];
         int o4 = tomb[3] + tomb1[3];
          int o5 = tomb[4] + tomb1[4];
           int o6 = tomb[5] + tomb1[5];
            int o7 = tomb[6] + tomb1[6];
             int o8 = tomb[7] + tomb1[7];
              int o9 = tomb[8] + tomb1[8];
               int o10 = tomb[9] + tomb1[9];
        System.out.println("\na tömb számai");
        System.out.println("1.: " + tomb[0] + "+" + " " + tomb1[0]+"= "+ o1);
        System.out.println("2.: " + tomb[1] + "+" + " " + tomb1[1]+"= "+ o2);
        System.out.println("3.: " + tomb[2] + "+" + " " + tomb1[2]+"= "+ o3);
        System.out.println("4.: " + tomb[3] + "+" + " " + tomb1[3]+"= "+ o4);
        System.out.println("5.: " + tomb[4] + "+" + " " + tomb1[4]+"= "+ o5);
        System.out.println("6.: " + tomb[5] + "+" + " " + tomb1[5]+"= "+ o6);
        System.out.println("7.: " + tomb[6] + "+" + " " + tomb1[6]+"= "+ o7);
        System.out.println("8.: " + tomb[7] + "+" + " " + tomb1[7]+"= "+ o8);
        System.out.println("9.: " + tomb[8] + "+" + " " + tomb1[8]+"= "+ o9);
        System.out.println("10.: " + tomb[9] + "+" + " " + tomb1[9]+"= "+ o10);
        
    }
}
