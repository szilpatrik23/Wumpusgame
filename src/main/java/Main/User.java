package Main;
public class User {
    private final Iscanner scan;
    
    private int pont;
    private String felhasznev;
    
    public User(Iscanner scan){
        this.scan = scan;
        this.pont = 0;
        this.felhasznev = "";
    }
    
    public String FelnevBeker(){
        String input;
        do{
            input = FelhasznalotolBeker();
            if(!joFelhasznalonev(input))
            {
                System.out.println("Hibás felhasználónév!");
            }
          }
        while(joFelhasznalonev(input));
        
        
        felhasznev = input;
        return felhasznev;
    }
    
    
    private String FelhasznalotolBeker(){
        System.out.println("Kérlek add meg a felhasználóneved ami 20 karakter hosszú lehet!");
        return scan.nextLine();
    }
    
    private boolean joFelhasznalonev(String username){
        return username.length() >= 2 && username.length() <= 20;
    }
    
    public String getFelhasznev()
    {
        return felhasznev;
    }
    public int getPont(){
        return pont;
    }
    public void pontNovelo(){
        pont++;
    }
    
    public String getFelhasznaloPonttal()
    {
        return ("Kedves "+ getFelhasznev() +" ennyi pontod van jelenleg: "+getPont());
    }
}
