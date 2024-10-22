package CalcolaArea;

public class Triangolo extends Forma{

    private double base;
    private double altezza;

    Triangolo (double base, double altezza){
        super(base, altezza);
    }

    @Override
    public void calcolaArea(){
        System.out.println("L'area del triangolo è:" +(getBase()*getAltezza())/2);
    }
}
