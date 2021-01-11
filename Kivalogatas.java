package kivalogatas;
import java.util.Scanner;
public class Kivalogatas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("\n\tKIVÁLOGATÁS TÉTEL KIEGÉSZÍTÉSE\n");
        System.out.print("Hány szám legyen a tömbben?");
        int elemSzam = input.nextInt();
        /* Deklarálás
        A változónak olyan nevet adunk ami elmondja a funkcióját 
        pl.: "parosSzamDb" a páros számokat számolja meg.
        A változókat camelCase alkalmazásával hoztam létre*/
        int[] jegy = new int[elemSzam];
        int[] egyesek = new int[elemSzam];
        int[] kettesek = new int[elemSzam];
        int[] harmasok = new int[elemSzam];
        int[] negyesek = new int[elemSzam];
        int[] otosok = new int[elemSzam];
        int[] db = new int [5];
        // A kiíratás elé teszek 2 sort, hogy átláthatóbb legyen
        System.out.println("\n\nÉrdemjegyek: ");
        //a for ciklus változóját a szokások alapján neveztem el "i" ami iterációt, indexet jelent
        for (int i = 0; i < elemSzam; i++) {
            jegy[i]=(int)(Math.random() * 5) +1;
            System.out.print(String.format("%, 5d", jegy[i]));
        }
        System.out.println("\n\n");     
        // Megvizsgáljuk és bemásoljuk a számokat a megfelelő tömbbe            
        for (int i = 0; i < elemSzam; i++) {
            if (jegy[i] == 1)
                egyesek[db[1]++] = jegy[i];
            if (jegy[i] == 2)
                kettesek[db[2]++] = jegy[i];
            if (jegy[i] == 3)
                harmasok[db[3]++] = jegy[i];
            if (jegy[i] == 4)
                negyesek[db[4]++] = jegy[i];
            if (jegy[i] == 5)
                otosok[db[5]++] = jegy[i];
        }
        // Kiíratjuk a tömbök elemeit
        System.out.print("\nEgyes tömb elemei: ");
        for (int i = 0; i < db[1]; i++) 
            System.out.print(egyesek[i]+" ");
        System.out.print("\nKettes tömb elemei: ");
        for (int i = 0; i < db[2]; i++) 
            System.out.print(kettesek[i]+" ");
        System.out.print("\nHármas tömb elemei: ");
        for (int i = 0; i < db[3]; i++)
            System.out.print(harmasok[i]+" ");
        System.out.print("\nNégyes tömb elemei: ");
        for (int i = 0; i < db[4]; i++)
            System.out.print(negyesek[i]+" ");
        System.out.print("\nÖtös tömb elemei: ");
        for (int i = 0; i < db[5]; i++) 
            System.out.print(otosok[i]+" ");
        // Kiíratjuk a tömbbe szereplő számok darabszámát
        System.out.print("\n\n\nEgyesek száma: "+db[1]);
        System.out.print("\nKettesek száma: "+db[2]);
        System.out.print("\nHármasok száma: "+db[3]);
        System.out.print("\nNégyesek száma: "+db[4]);
        System.out.println("\nÖtösök száma: "+db[5]);
    }
}