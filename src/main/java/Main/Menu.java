package Main;

import java.util.Scanner;
public class Menu {
    private final Scanner scan = new Scanner(System.in);
    
    //Game game = new Game();
    
    public void FoMenu()
    {
     FoMenuKiiras();
     int valasztas = scan.nextInt();
        switch (valasztas) {
            case 1:
                JatekMenu();
                break;
            case 2:
                System.out.println("Kilépés a játékból!");
                System.exit(0);
                break;
            default:
                System.out.println("Érvénytelen karakter!");
                FoMenu();
        }
    }
    
    public void JatekMenu(){
        JatekMenuKiiras();
        int valasztas = scan.nextInt();
        switch (valasztas) {
            case 1:
                
                //Game.startgameplay();
                break;
            case 2:
                System.out.println("Fejlesztés alatt!");
                break;
            case 3:
               FoMenu();
               break;
            default:
                System.out.println("Érvénytelen karakter!");
                JatekMenu();
        }
    }
    
    public void FoMenuKiiras()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("||                            ||");
        System.out.println("||        |ÜDVÖZÖLLEK!|       ||");
        System.out.println("||                            ||");
        System.out.println("||         |FŐMENÜ|           ||");
        System.out.println("||                            ||");
        System.out.println("||        1. Játék            ||");
        System.out.println("||        2. Kilépés          ||");
        System.out.println("||                            ||");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void JatekMenuKiiras()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("||                            ||");
        System.out.println("||         |FŐMENÜ|           ||");
        System.out.println("||                            ||");
        System.out.println("|| 1. Pálya választás fájlból ||");
        System.out.println("|| 2. Pálya választás adbból  ||");
        System.out.println("||                            ||");
        System.out.println("||         3. Főmenű          ||");
        System.out.println("||                            ||");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}      