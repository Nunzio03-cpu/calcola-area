package CalcolaArea;

public class Rettangolo extends Forma{
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
        System.out.println("L'area del rettangolo è: " +(base*altezza));
    }

}
