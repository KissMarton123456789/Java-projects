/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldontes;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Eldontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in); //Scanner behívása
                //deklaráljuk és inicializáljuk a változókat
        int elemSzam;
        System.out.print("Adj meg egy pozitív számot");
        elemSzam = input.nextInt();
        int[] szamok = new int  [elemSzam];
       
        
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int)(Math.random()*40)-20;   //-20 és + 20 között
            System.out.print(szamok[i]+"  ");            
        }
        
        //megvizsgáljuk,hogy van-e 0 a számsorba
        for (int i = 0; i < elemSzam; i++) {
            if(szamok[i]==0){
                System.out.println("\n\nA számsor tartalmaz 0-át\n");
            }
        }
        /*for (int i = 0; i < elemszam; i++) {
            if (Math.abs(szamok1[i])%10 == 0) 
                    ujTomb[ujTombElemszam++] = szamok1[i];
            if (Math.abs(szamok2[i])%10 == 0) 
                    ujTomb[ujTombElemszam++] = szamok2[i];
            }
            //kiíratjuk az "ujTomb" elemeit (ha van)
            if (ujTombElemszam == 0) 
                System.out.print("\nNincs öttel osztható páros szám a tömbben");
            else 
                System.out.print("\nA 10el osztható számok a tömbből: ");
            for (int i = 0; i < ujTombElemszam; i++) 
                System.out.print(String.format("%, 5d", ujTomb[i]));
                System.out.println("");
            //6. feladat van/nincs elem a tömbbe
            ujTombElemszam=0;
            for (int i = 0; i < ujTombElemszam; i++) {
               if (Math.abs(szamok1[i])%2 ==0 && Math.abs(szamok1[i])%5 == 0)
                     ujTombElemszam++;
                if (Math.abs(szamok2[i])%2 ==0 && Math.abs(szamok2[i])%5 == 0)
                     ujTombElemszam++;
            }
            ujTomb = new int[ujTombElemszam];
            
            for (int i = 0; i < ujTombElemszam; i++) {
                 if (ujTomb[i] == 0) 
                     nullaDb++;
            }
            System.out.print("\nAz ujTomb elemei: ");
                for (int i = 0; i <ujTombElemszam ; i++)
                    System.out.print(ujTomb[i]+" ");

             if (nullaDb == 0) 
                 System.out.println("\nA tömbök nem tartalmaznak nullát");
             else
                 System.out.println("\nA nullák száma: " + nullaDb);*/
    }
    
}
