package Main;

import java.util.Scanner;

public class Menu {
    public static void fomenu(){
        Scanner scanner = new Scanner(System.in);
        
        // Felhasználónév bekérése
        System.out.println("Kérlek add meg a felhasználóneved");
        String felhasznalnev = scanner.nextLine();
        System.out.println("Köszöntelek a játékban " + felhasznalnev + "!");
        
        //Alapmenü
        while(true)
        {
            System.out.println("\nAlapmenü:");
            System.out.println("1. Játék");
            System.out.println("2. Fájlból beolvasás");
            System.out.println("3. Adatbázisból betöltés");
            System.out.println("4. Adatbázisba mentés");
            System.out.println("5. Pályaszerkesztés");
            System.out.println("6. Kilépés");
            
            // Felhasználó választása
            System.out.print("Válasszon a fenti lehetőségek közül (1-6): ");
            int valasztas = 0;
            try {
                valasztas=Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Érvénytelen bemenet. Kérem, adjon meg egy számot (1-6).");
                continue;
            }
            scanner.nextLine(); // Üres sor beolvasása

            switch (valasztas) {
                case 1:
                    System.out.println("Játék");
                    // Itt hozzáadható a pályaszerkesztés logikája
                    break;
                case 2:
                    System.out.println("Fájlból beolvasás...");
                    // Itt hozzáadható a fájlból beolvasás logikája
                    break;
                case 3:
                    System.out.println("Adatbázisból betöltés...");
                    // Itt hozzáadható az adatbázisból betöltés logikája
                    break;
                case 4:
                    System.out.println("Adatbázisba mentés...");
                    // Itt hozzáadható az adatbázisba mentés logikája
                    break;
                case 5:
                    System.out.println("Pályaszerkesztés...");
                   
                    break;
                case 6:
                    System.out.println("Kilépés. Viszontlátásra!");
                    System.exit(0);
                default:
                    System.out.println("Érvénytelen bemenet. Kérem, adjon meg egy számot (1-6).");
        }
        
    }
    
}
}
        