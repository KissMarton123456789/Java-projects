package megszamlalas;

import java.util.Scanner;

public class Megszamlalas {
    public static void main(String[] args) {
        System.out.println("\n\tMÉGSZÁMLÁLÁS TÉTELE\n");
        System.out.print("Hány eleme legyen a tömbnek: ");
        Scanner bemenet = new Scanner(System.in);
        //A változónak olyan nevet adunk ami elmondja a funkcióját pl.:"parosSzamDb" a páros számokat számolja meg
        int elemSzam = bemenet.nextInt();
        int parosSzamDb=0;                  
        int[] tomb = new int  [elemSzam];
        int szamokDb=0;
        System.out.println("A tömb elemei:");
        for(int i = 0; i < elemSzam; i++)
        {
            tomb[i] = (int) (Math.random() * 999) + 1;  //aktuális tömbelem
            szamokDb++;                                 //smokDb=szamokDb+1
            System.out.print(String.format("%, 5d", i + 1) + ".: " );
            System.out.print(String.format("%, 5d", tomb[i])+"\n");
            if (tomb[i]%2==0) 
                parosSzamDb++; 
        }
        System.out.println(elemSzam+"="+tomb.length+"= "+szamokDb);
        System.out.println("Páros számok db-számok: "+parosSzamDb);
    }
}
