package Main;

public class Tabla {
    private int meret;
    private char [] [] tabla;
    private char [] [] eredetitabla;
    // Új mező miatt
    
    public Tabla(int meret, char [][] tabla, Hos hos)
    {
        this.meret = meret;
        this.tabla = tabla;
        //this.hos = hos;// Hős osztály létrehozása után rá nézni
        this.eredetitabla = new char[meret] [meret];
        
    }
    
}
