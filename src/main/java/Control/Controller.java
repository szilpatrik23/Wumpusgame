package Control;

import Main.Menu;
import Main.Tabla;
import Main.User;
import Control.Pozicio;

public class Controller {
    
    private Irany hosIrany;
    private Pozicio hosPozi;
    private Tabla tabla ;
    private  User user;
    Menu menu= new Menu();
    
    private int lepes;
    
    public Controller(User user){
        this.user= user;
    }
    
    public void setKezdoPozicio(Pozicio kezdopozicio, Irany kezdoirany){
        this.hosPozi = kezdopozicio;
        this.hosIrany = kezdoirany;
    }
    
    public void setTabla(Tabla tabla)
    {
        this.tabla = tabla;
    }
    
    public void billentyuParancs(String karakter){
        int oldSor = hosPozi.getSor();
        char oldOszlop = hosPozi.getOszlop();
        
        switch (karakter.toLowerCase()) {
            case "w":
                hosIrany = Irany.ESZAK;
                hosPozi.mozgásFel();
                break;
            case "a":
                hosIrany = Irany.NYUGAT;
                hosPozi.mozgasBal();
                break;
            case "s":
                hosIrany = Irany.DEL;
                hosPozi.mozgasLe();
                break;
            case "d":
                hosIrany = Irany.KELET;
                hosPozi.mozgasJobb();
                break;
            case "i":
                //  nyil kilövése ide kell majd 
                break;
            default:
                System.out.println("Érvénytelen karakter!");
               return;
        }
        
        
    }
    
   }
