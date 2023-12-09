package Main;

import java.util.Scanner;
public class Game {
    
    private static final User user = createUser();
    //private static final DatabaseManager databaseManager= new DatabaseManager(); nincs ilyen osztály nem biztos hogy lesz 
    //private static final String DATABASE_URL = DatabaseConfig.DATABASE_URL;
    private static String felhasznev;
    
    private static User createUser() {
        Iscanner scan = new Iscanner() {
            @Override
            public String nextLine() {
                return new Scanner(System.in).nextLine();
            }
        };

        return new User(scan);
    }
    
    
    public static void JatekKezdes(){
        felhasznev = user.FelnevBeker();
        System.out.println("Üdvözöllek " + felhasznev);
        
        menuIndit();
    }
    public static void menuIndit(){
        Menu menu = new Menu();
        menu.FoMenu();
    }
}
