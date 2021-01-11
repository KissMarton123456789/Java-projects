package kiválasztás;
public class Kiválasztás {
    public static void main(String[] args) {
        System.out.println("\n\tKIVÁLOGATÁS\n");
        // Deklaráljuk változókat
        int elemszam =(int) (Math.random()*5)+5;
        int[] szamtomb1 = new int[elemszam];
        int[] szamtomb2 = new int[elemszam];
        int[] szamtomb3 = new int[elemszam];
        // Feltöljük a tömböket random számokkal 100 és -100 között
        for (int i = 0; i < elemszam; i++) {
            szamtomb1[i]= (int) (Math.random()*200)-100;
            szamtomb2[i]= (int) (Math.random()*200)-100;
            szamtomb3[i]= (int) (Math.random()*200)-100;
        }
        // Kiíratjuk a tömbök elemeit
        System.out.print("Első tömb elemei:     ");
        for (int i = 0; i < elemszam; i++) 
            System.out.print(String.format("%, 5d",szamtomb1[i]));
        System.out.print("\nMásodik tömb elemei:  ");
        for (int i = 0; i < elemszam; i++) 
            System.out.print(String.format("%, 5d",szamtomb2[i]));
        System.out.print("\nHarmadik tömb elemei: ");
        for (int i = 0; i < elemszam; i++) 
            System.out.print(String.format("%, 5d",szamtomb3[i]));
        System.out.println("");
    }
}