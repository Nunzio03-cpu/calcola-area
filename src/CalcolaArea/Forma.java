package CalcolaArea;
/*
Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che
stampi l'area della forma specifica.
Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne
identifichi la Forma in maniera univoca usando una enum.
 */
enum Forme{
    rettangolo,
    triangolo
}
public abstract class Forma {
    protected double base;
    protected double altezza;
    private final Forme laMiaForma;

    public Forma(double base, double altezza, Forme laMiaForma) {
        this.base = base;
        this.altezza = altezza;
        this.laMiaForma = laMiaForma;
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

    public Forme getLaMiaForma() {
        return laMiaForma;
    }

    public abstract void calcolaArea();

}
