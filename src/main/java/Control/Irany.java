package Control;
public enum Irany {
        ESZAK('E'),
        DEL('D'),
        KELET('K'),
        NYUGAT('N');
                
private final char jel;
    
    private Irany(char jel) {
        this.jel = jel;
    }
    
    public char getJel(){
        return jel;
    }
    
    public static char FromJel(char jel){
        for (Irany irany : values()) {
            if (irany.jel == jel) {
                return jel;
            }
        }
        throw new IllegalArgumentException("Ismeretlen irány: " + jel);
    }
}
