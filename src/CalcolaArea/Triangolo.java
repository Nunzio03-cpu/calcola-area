package CalcolaArea;
/*
A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area, aggiungere
una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 */
public class Triangolo extends Forma{
    private double base;
    private double altezza;

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

    @Override
    public void calcolaArea(){
        System.out.println("L'area del triangolo è:" +(base*altezza)/2);
    }
}
