package Control;

public class Pozicio {
    private int sor;
    private char oszlop;

    public Pozicio(int sor, char oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;
    }

    public Pozicio() {
    }


    public char getOszlop() {
        return oszlop;
    }

    public void setOszlop(char oszlop) {
        this.oszlop = oszlop;
    }

    public void mozgásFel() {
        sor--;
    }

    public void mozgasLe() {
        sor++;
    }

    public void mozgasBal() {
        oszlop--;
    }

    public void mozgasJobb() {
        oszlop++;
    }

    public String toString() {
        return "(" + sor + ", " + oszlop + ")";
    }

    public void setSor(int sor) {
        this.sor = sor;
    }

    public int getSor() {
        return sor;
    }

    
    public Pozicio masolas() {
        return new Pozicio(sor, oszlop);
    }
    public void mozgasIrany(Irany irany) {
        switch (irany) {
            case ESZAK:
                sor--;
                break;
            case NYUGAT:
                oszlop--;
                break;
            case DEL:
                sor++;
                break;
            case KELET:
                oszlop++;
                break;
        }
    }

}
