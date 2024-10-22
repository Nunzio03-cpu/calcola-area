package CalcolaArea;
/*
Esercizio classi astratte
Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato
calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il
calcolo dell'area in maniera specifica.
 */

public abstract class Forma {
    private double base;
    private double altezza;

    public Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public abstract void calcolaArea();

}
